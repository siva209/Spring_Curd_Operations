package com.example.demo.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserEntity;
import com.example.demo.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
//@RequestMapping("/v1/user/getuser")
@Slf4j
public class UserController {
	
	Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/user")
	public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity userentity) {
		logger.debug("Request received to create user");		
		return new ResponseEntity<>(userService.createUser(userentity), HttpStatus.CREATED);
		
	}
	@GetMapping(value="/users")
	public List<UserEntity>findAllUsers(){
		return userService.findAllUsers();
			}
	@GetMapping("/userby/{id}")
	public UserEntity getUserById(@PathVariable ("id") int id) {
	System.out.println(""+id);
	return userService.getUserById(id);
	
	
	}
	@GetMapping("/getuserbyname/{name}")
//	@GetMapping("/user/{name}")
	public UserEntity getUserByName(@PathVariable String name) {
	System.out.println(""+name);
	return userService.getUserByName(name);
	
	
	}
	@GetMapping("/getuserbycountry/{country}")
//	@GetMapping("/user/{country}")
	public UserEntity getUserByCountry(@PathVariable String country) {
		return userService.getUserByCountry(country);
	}
//	@GetMapping("/getuserbypassport/{passport}")
	@GetMapping("/user/{passport}")
	public UserEntity getUserByPassportd(@PathVariable String passport) {
		return userService.getUserByPassportd(passport);
	}
	
	@PutMapping("/user/{id}/{name}")
//	@PutMapping("/updatebyname/{id}?{name}")
	public UserEntity updateByUserId(@PathVariable int id,@PathVariable String name) {
		return userService.updateByUserId(id, name);
	}
//	@DeleteMapping("/deleteuser/{id}")
	@DeleteMapping("/user/{id}")
	public void deleteById(@PathVariable int id) {
		userService.deleteById(id);
}
	
	
	
}
