package com.cognizant.bloodbank.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.bloodbank.model.User;
import com.cognizant.bloodbank.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public List<User> getDonorList(String bg,int pc)
	{
		return userRepository.getDonorList(bg, pc);
	}


}
