package com.ssm.example.entity;

import java.io.Serializable;
import java.util.Date;

public class UserEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5815107203310061915L;
	private int id;
	private String username;
	private String password;
	private Date time;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
