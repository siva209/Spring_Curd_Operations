package com.example.demo.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;


@Service
public class UserviceServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;


	@Override
	public UserEntity createUser(UserEntity user) {
//		RestTemplate ty=new RestTemplate();
//		UserEntity user1=ty.postForObject("http://localhost:8080/restapi/",user,UserEntity.class);
		System.out.println(user);
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}
	

	@Override
	public List<UserEntity> findAllUsers() {
		System.out.println("kk");
		return userRepo.findAll();
	}

	@Override
	public UserEntity getUserById(int id) {
		System.out.println("service impl" + id);
		Optional<UserEntity> data= userRepo.findById(id);
		if(data.isPresent()) {
			System.out.println("entered");
			
		}
		System.out.println("daata=" + data);
		return data.get();
	}

	@Override
	public UserEntity getUserByName(String name) {
		
			return userRepo.getUserByName(name);
			
			
		}

	@Override
	public UserEntity getUserByCountry(String country) {
		return userRepo.getUserByCountry(country);
		
	}

	@Override
	public UserEntity getUserByPassportd(String passport) {
		return userRepo.getUserByPassportd(passport);
		
	}

	@Override
	public UserEntity updateByUserId(int id, String name) {
		UserEntity data=userRepo.getById(id);
		System.out.println(data);
		data.setName(name);
		userRepo.save(data);
		return data;
	}

	@Override
	public void deleteById(int id) {
		 userRepo.deleteById(id);
		
	}


	
		
	}


