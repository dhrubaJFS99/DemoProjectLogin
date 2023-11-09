package com.example.User_Management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User_Management.model.UserDetails;
import com.example.User_Management.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails createUser(UserDetails user) {
		
		return userRepo.save(user);
	}
	
	

}
