package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String emailid;
	private String passwrod;
	private String role;
	public User(int id, String username, String emailid, String passwrod, String role) {
		super();
		this.id = id;
		this.username = username;
		this.emailid = emailid;
		this.passwrod = passwrod;
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", emailid=" + emailid + ", passwrod=" + passwrod + "]";
	}
	public User(int id, String username, String emailid, String passwrod) {
		super();
		this.id = id;
		this.username = username;
		this.emailid = emailid;
		this.passwrod = passwrod;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
