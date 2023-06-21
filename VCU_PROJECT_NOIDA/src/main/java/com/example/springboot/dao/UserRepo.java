package com.example.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, String>{

}
