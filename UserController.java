package com.cognizant.bloodbank.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.bloodbank.BloodbankApplication;
import com.cognizant.bloodbank.exception.UserAlreadyExistsException;
import com.cognizant.bloodbank.model.User;
import com.cognizant.bloodbank.security.AppUserDetailsService;


//@RestController
//public class UserController {
	
/*@GetMapping("/test/{bg}/{pc}")
public List<User> getDonorList(@PathVariable String bg,@PathVariable int pc)
{
	return userService.getDonorList(bg, pc);
}
}*/
@RestController
@RequestMapping("/users") 
public class UserController {
                private static final Logger LOGGER = LoggerFactory.getLogger(BloodbankApplication.class);
                
//            @Autowired
//            InMemoryUserDetailsManager inMemoryUserDetailsManager;

                @Autowired
                AppUserDetailsService appuserDetailsService;
                
                @PostMapping
                public boolean signup(@RequestBody @Valid User user) throws UserAlreadyExistsException {
appuserDetailsService.signup(user);
return true;
                }
                

}


