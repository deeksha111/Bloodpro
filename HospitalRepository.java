package com.cognizant.bloodbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.bloodbank.model.Hospitals;
@Repository
public interface HospitalRepository extends JpaRepository<Hospitals, Integer> {
	
	
	@Query(value="select hp_name from hospital join address on hp_addr_id_fk =  addr_id where addr_pincode=:pincode",nativeQuery=true)
	public List<Hospitals> getHospitalList(@Param(value = "pincode")int pincode);

}
