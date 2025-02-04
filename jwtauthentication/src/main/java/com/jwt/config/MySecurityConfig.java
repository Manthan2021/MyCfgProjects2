package com.jwt.config;

import com.jwt.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	private JwtAuthenticationFilter jwtFilter;
	
	
@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserDetailsService);
		
	}	
	
@Override
protected void configure(HttpSecurity http) throws Exception {
	http
	.csrf()
	.disable()
	.cors()
	.disable()
	.authorizeRequests()
	.antMatchers("/token").permitAll()
	.anyRequest().authenticated()
	.and()
	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	
	
	http.addFilterBefore(jwtFilter,UsernamePasswordAuthenticationFilter.class);
	
}

@Bean
 public PasswordEncoder passwordEncoder() {
	 return NoOpPasswordEncoder.getInstance();
 }

@Bean
public AuthenticationManager authenticationManagerBean() throws Exception {
	return super.authenticationManagerBean();
}


}
