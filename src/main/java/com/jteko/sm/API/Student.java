package com.jteko.sm.API;

public class Student {
	
	private int id;
	private String name, email, matno;
	private long phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMatno() {
		return matno;
	}
	public void setMatno(String matno) {
		this.matno = matno;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", matno=" + matno + ", phone=" + phone
				+ "]";
	}
	
	
	
}
