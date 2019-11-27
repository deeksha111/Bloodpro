package com.cognizant.bloodbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.bloodbank.repository.HospitalRepository;
import com.cognizant.bloodbank.repository.SlotBookingRepository;
@Service
public class SlotBookingService {

	
	@Autowired
	SlotBookingRepository slotBookingRepository;
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	

}
