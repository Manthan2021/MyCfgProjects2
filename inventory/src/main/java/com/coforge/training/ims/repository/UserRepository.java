package com.coforge.training.ims.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.coforge.training.ims.model.Dealer;
import com.coforge.training.ims.model.DealerAddress;

public interface UserRepository extends CrudRepository<Dealer, Long> {

	
	/*JPA finder methods are the most powerful methods, we can create finder methods to select the records from the database without writing SQL queries.
	To create finder methods in Data JPA, we need to follow a certain naming convention. To create finder methods for the entity class field name,
	 we need to create a method starting with findBy followed by field name.
	*/
	public Dealer findByEmail(String email);
	
	public  Optional<Dealer> findItByEmail(String email);//custom Repository Method(only decleration)	
	
	
	
	//custom queries using JPQL in CRUD repository
	
	@Query("select new com.coforge.training.ims.model.DealerAddress(d.id,d.email,d.fname,d.lname,d.password,"
			+ "d.dob,d.phoneNo,a.street,a.city,a.pincode) from Dealer d Inner Join d.address a")
	
	public List<DealerAddress> fetchDealerInnerJoin();

}
