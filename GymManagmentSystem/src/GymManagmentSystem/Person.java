package GymManagmentSystem;

import java.util.Scanner;
import java.lang.Exception;

abstract class Person {

	Scanner input = new Scanner (System.in);
	 private String name , Email , gender;
	 private int age;
	 private long phoneNumber;
	 
	public Person() {
		getInput();		
	}
	
	
	protected void getInput() {
		while (true) {
		try {
			System.out.println("Enter Name :");
			name = input.next();
			System.out.println("Enter Age :");
			age = input.nextInt();
			System.out.println("Enter Email :");
			Email = input.next();
			System.out.println("Enter Gender (Male / Female) :");
			gender = input.next();
			System.out.println("Enter Phone Number (+20) :");
			phoneNumber = input.nextInt();
			break;
			}
			catch (Exception e){
				System.out.println("Please enter a valid input...");
				input.next();
			}
		
		}
	
	}
	
	public Person(String name, String email, String gender, int age, long phoneNumber) {
		
		this.name = name;
		Email = email;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return Email;
	}


	public String getGender() {
		return gender;
	}


	public int getAge() {
		return age;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	protected abstract String getDetails();
		
	 
	
	
	
	
	
	
	
	
	
	
	
	
}
