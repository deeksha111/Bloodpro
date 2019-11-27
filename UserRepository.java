package com.cognizant.bloodbank.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognizant.bloodbank.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {
	@Query(value="select * from user where us_firstname=:value",nativeQuery=true)

	public Optional<User> findByFirstname(@Param (value="value")String firstname);
	 
	@Query(value="select * from user where us_id IN (select ua_us_id_fk from user_address join address on ua_addr_id_fk=addr_id where addr_pincode=:pincode) and us_bloodgroup=:bloodgroup",nativeQuery=true)
	public List<User> getDonorList(@Param(value = "bloodgroup") String bloodgroup,@Param(value = "pincode")int pincode);

	
	

}
