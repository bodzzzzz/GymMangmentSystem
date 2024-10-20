package GymManagmentSystem;

import java.util.Scanner;

public class PartTimeCoach extends Coach {

	Scanner input = new Scanner (System.in);
	
	private final int Hourly_Rate = 7;
	private int Hours_Worked ;
	static int countPartCoaches = 2;
	
	public PartTimeCoach(String name, String email, String gender, int age, long phoneNumber, 
			 int yearsOfExperience, String specialty) {
		super(name, email, gender, age, phoneNumber, yearsOfExperience, specialty);
	}

	public PartTimeCoach() {
		boolean TrueInput = false;
		do {
			try {
		
		System.out.println("Please enter Hours Worked : ");
		Hours_Worked = input.nextInt();
		System.out.println(super.getDetails());
		System.out.println("Salary: " + this.calc_Salary()+ "$" +"\n Thank you for registering in SIM gym, Coach " + super.getName() + " !");
		countPartCoaches++;
		TrueInput = true;
			}catch(Exception e) {
				System.out.println("Enter valid input...");
				input.next();
			}
		
		}while(!TrueInput);
	}

	public static int getPartCountCoaches() {
		return countPartCoaches;
	}

	@Override
	protected int calc_Salary() {
	
		return (Hourly_Rate * Hours_Worked);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
