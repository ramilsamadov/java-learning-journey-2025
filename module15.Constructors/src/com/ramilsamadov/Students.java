package com.ramilsamadov;

public class Students {
	public int id;
	public String name;
	public String surname;
	public String sex;
	// Constructor overloading: same name, different parameter list
	// You can overload a constructor by changing:
	// 1. Number of parameters
	// 2. Types of parameters

	public Students(int id,String name,String surname) {
		System.out.println("Our constructor works!!!");
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	public Students() {
        // Optionally set default values
        this.id = 0;
        this.name = "Unknown";
        this.surname = "Unknown";
	}
	public Students(String sex) {
		this.sex = sex;
	}
	public void printt() {
		System.out.println("Print gender "+this.sex);
	}
	
}
