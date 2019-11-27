package com.cognizant.bloodbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.bloodbank.model.BloodRequest;
import com.cognizant.bloodbank.repository.BloodRequestRepository;
@Service
public class BloodRequestService {

	@Autowired
	BloodRequestRepository bloodRequestRepository;
	
	
	public void postRequirement(BloodRequest bloodRequest) {
		// TODO Auto-generated method stub
		System.err.println("bloodrequest"+bloodRequest);
		bloodRequestRepository.save(bloodRequest);
	}


	public List<BloodRequest> getRequirement() {
		// TODO Auto-generated method stub
	return bloodRequestRepository.findAll();	
	}

}
