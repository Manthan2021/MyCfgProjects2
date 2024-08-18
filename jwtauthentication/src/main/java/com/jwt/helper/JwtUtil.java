package com.jwt.helper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;



import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

//methods-for generating token
//validate
//isExp
//util class for jwt
@Component
public class JwtUtil {
	

	private static final long serialVersionUID=-2550185165626007488L;
	public static final long JWT_TOKEN_VALIDITY=5*60*60;
	private String secret="hellodear";
	
	public String getUsernameFromToken(String token) {
		String username;
		try {
			final Claims claims = getClaimsFromToken(token);
			username = claims.getSubject();
			
		} catch (final Exception e) {
			username = null;
		}
		
		
		return username;
	}
	
	public Date getExpirationDateFromToken(String token) {
		Date expiration;
		try {
			final Claims claims = getClaimsFromToken(token);
			expiration = claims.getExpiration();
		} catch (final Exception e) {
			expiration = null;
		}
		return expiration;
	}
	
	
	private Claims getClaimsFromToken(String token) {
        Claims claims;
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            System.out.print("Could not get all claims Token from passed token");
            claims = null;
        }
        return claims;
    }
	
	
	
	
//	private Claims getClaimsFromToken(String token) {
//		Claims claims;
//		try {
//			claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//		} catch (final Exception e) {
//			claims = null;
//		}
//		System.out.println("hellou"+claims);
//		return claims;
//	}
	
	private Boolean isTokenExpired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	
	private Date generateExpirationDate() {
		return new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY* 1000);
	}
	
//	private String generateToken(Map<String, Object> claims) {
//		return Jwts.builder().setClaims(claims).setExpiration(generateExpirationDate())
//				.signWith(SignatureAlgorithm.HS512, secret).compact();
//	}
	
	
	
	
	public String generateToken(UserDetails userDetails) {
		Map<String,Object> claims=new HashMap();
		return doGenerateToken(claims,userDetails.getUsername());
	}
	
	
	
	private String doGenerateToken(Map<String, Object> claims, String subject) {
	// TODO Auto-generated method stub
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY))
				.signWith(SignatureAlgorithm.HS512, secret).compact();

		
}

	public Boolean validateToken(String token, UserDetails userDetails) {
		final String username = getUsernameFromToken(token);
		if (username == null) {
			return false;
		} else {
			return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
		}
	}
	
	
}
