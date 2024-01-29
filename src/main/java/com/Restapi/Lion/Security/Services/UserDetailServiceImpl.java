package com.Restapi.Lion.Security.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Restapi.Lion.Models.Users;
import com.Restapi.Lion.Repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Users user=userRepository.findByUsername(username)
		.orElseThrow(()->new UsernameNotFoundException("User not found with the username: "+username));
		
		return UserDetailsImpl.build(user);
				
	}	
}
