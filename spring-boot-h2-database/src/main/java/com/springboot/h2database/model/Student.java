package com.springboot.h2database.model;

public class Student {
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
public Student(int id, int age, String name, String email) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.email = email;
	}
private int id;
  private int age;
  private String name;
  private String email;

	
	
	
}
