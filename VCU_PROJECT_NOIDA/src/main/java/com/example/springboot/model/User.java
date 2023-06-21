package com.example.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class User {
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id	
	@NotEmpty(message="required field")
	private String username;
	@NotEmpty(message="required field")
	private String password;
	@NotEmpty(message="required field")
	private String fname;
	@NotEmpty(message="required field")
	private String lname;
	@NotEmpty(message="required field")
	private String email;
	@NotEmpty(message="required field")
	private String mobile_no;
	@NotEmpty(message="required field")
	private String address;
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", fname=" + fname + ", lname=" + lname
				+ ", email=" + email + ", mobile_no=" + mobile_no + ", address=" + address + "]";
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
