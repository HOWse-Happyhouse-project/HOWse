package com.ssafy.happyhouse.model;

public class UserDTO{
	private String id;
	private String password;
	private String name;
	private String email;
	private String age;
	
	public UserDTO() {}
	
	public UserDTO(String id, String password, String name, String email, String age) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", age=" + age
				+ "]";
	}
	
}
