package com.meals.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	private String userId;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String role;

}