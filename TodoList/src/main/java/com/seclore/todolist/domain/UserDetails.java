package com.seclore.todolist.domain;

public class UserDetails {
	private int userId;
	private String name;
	private String mobileNo;
	private String email;
	private String password;
	
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public UserDetails(int userId, String name, String mobileNo, String email, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
	
	
	
}
