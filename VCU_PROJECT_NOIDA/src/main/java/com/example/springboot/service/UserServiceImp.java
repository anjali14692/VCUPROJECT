package com.example.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.UserRepo;
import com.example.springboot.model.User;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepo userRepo;
	
	@Override
	public User save(User u) {
		// TODO Auto-generated method stub
		return userRepo.save(u);
	}
}
