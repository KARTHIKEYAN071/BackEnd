package com.example.demo.Entity;

//package com.example.StudentExample.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="operation")
public class stdentity {
	
	@Id
	@Column(name="sno")
	private int sno;
	@Column(name="Email")
	private String Email;
	@Column(name="Password")
	private String Password;
	@Column(name="ConformPassword")
	private String ConformPassword;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="DateOfBirth")
	private String DateOfBirth;
	@Column(name="Gender")
	private String Gender;
	@Column(name="PhoneNo")
	private String PhoneNo;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConformPassword() {
		return ConformPassword;
	}
	public void setConformPassword(String conformPassword) {
		ConformPassword = conformPassword;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	
	
	

	
	
	
	

	
	
	
}