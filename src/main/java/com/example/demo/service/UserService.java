package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.UserEntity;



public interface UserService {
	
	
	 UserEntity createUser(UserEntity user);
	List<UserEntity> findAllUsers();
	UserEntity getUserById(int id);
	UserEntity getUserByName(String name);
	UserEntity getUserByCountry(String country);
	UserEntity getUserByPassportd(String passport);
	UserEntity updateByUserId(int id,String name);
	void deleteById(int id);
	
	

}
