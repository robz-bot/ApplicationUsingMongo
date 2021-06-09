package com.rest.mongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {

	@Id
	private String id;
	private String rollNo;
	private String name;
	private String email;
	private String gender;
	private String contactNo;
	private String dob;
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", contactNo=" + contactNo + ", dob=" + dob + ", address=" + address + "]";
	}

	public Student() {
	}

	public Student(String rollNo, String name, String email, String gender, String contactNo, String dob,
			String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.contactNo = contactNo;
		this.dob = dob;
		this.address = address;
	}

}
