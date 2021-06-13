package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "user_entity")
public class UserEntity {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String country;
	private String passport;
	
	
	
	
	
	public UserEntity(int id, String name, String country, String passport) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.passport = passport;
		
		
		
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the passport
	 */
	public String getPassport() {
		return passport;
	}
	/**
	 * @param passport the passport to set
	 */
	public void setPassport(String passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", country=" + country + ", passport=" + passport + "]";
	}
	

}

