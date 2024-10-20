package GymManagmentSystem;

import java.util.Scanner;

abstract class Coach extends Person {

	 Scanner input = new Scanner(System.in);
	protected final int Basic_Salary = 7000;
	private int  YearsOfExperience;
	private String speciality;
	
	public Coach() {
		boolean TrueInput = false;	
		do {
			try {
		
		System.out.println( "Enter years of experience : ");
		YearsOfExperience = input.nextInt();
		input.nextLine();
		
		System.out.println( "Enter Speciality ( Calisthenics / BodyBuilding / Crossfit ) : ");
		speciality = input.nextLine();
		
		while (!speciality.equalsIgnoreCase("Calisthenics") && !speciality.equalsIgnoreCase("BodyBuilding") && !speciality.equalsIgnoreCase("Crossfit")) {
			System.out.println("Please enter one of the choices...");
			speciality = input.nextLine();
			
			if (speciality.equalsIgnoreCase("Calisthenics") || speciality.equalsIgnoreCase("BodyBuilding") || speciality.equalsIgnoreCase("Crossfit")) {
                
                break;
			} 
			else
				continue;
		}	
		
		TrueInput = true;
		
			}catch (Exception e) {
			System.out.println("Enter valid input...");
			input.nextLine();
		}
	
	}while (!TrueInput);
}
		
	public Coach(String name, String email, String gender, int age, long phoneNumber,
			int yearsOfExperience, String speciality) {
		
		super(name, email, gender, age, phoneNumber);
		
		YearsOfExperience = yearsOfExperience;
		this.speciality = speciality;
	}


	

	public int getYearsOfExperience() {
		return YearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		YearsOfExperience = yearsOfExperience;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	
	protected abstract int calc_Salary();
	
	


	public int getBasic_Salary() {
		return Basic_Salary;
	}


	@Override
	protected String getDetails() {
		
		return '{' + " Name: " + super.getName() + "\nGender: " + super.getGender() + "\nEmail: " + super.getEmail() + "\nPhone Number: " + super.getPhoneNumber() + "\nAge: " + super.getAge()+'}';
	}
	
	
	
}
