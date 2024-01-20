package com.NewUserLogin;

public class NewUserLogin {
	
	private String fname;
	private String email;
	private String password;
	private String gender;
	private String lname;
	private String contact;
	private String cpassword;
	
	
	
	public NewUserLogin(String fname, String email, String password, String gender, String lname, String contact,
			String cpassword) {
		super();
		this.fname = fname;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.lname = lname;
		this.contact = contact;
		this.cpassword = cpassword;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
	
	
	

}
