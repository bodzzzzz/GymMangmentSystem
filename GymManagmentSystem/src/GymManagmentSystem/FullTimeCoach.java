package GymManagmentSystem;
import java.lang.Exception;
import java.util.Scanner;

public class FullTimeCoach extends Coach {
	
	static int countFullCoaches = 3;
	private int Bonus , deduction;
	Scanner input = new Scanner(System.in);
	
	public FullTimeCoach() {
		boolean TrueInput = false;
	do {
		try {
		System.out.println("Enter Bonus : ");
		Bonus = input.nextInt();
		System.out.println("Enter Deduction : ");
		deduction = input.nextInt();
		System.out.println(super.getDetails());
		System.out.println("Salary: " + this.calc_Salary()+ "$" +"\n Thank you for registering in SIM gym, Coach " + super.getName() + " !");		
		countFullCoaches++;
		TrueInput = true;
		} catch (Exception e) {
			System.out.println("Enter valid input...");
			input.next();
		}
	} while (!TrueInput);

	}
	
	
	public FullTimeCoach(String name, String email, String gender, int age, long phoneNumber, int yearsOfExperience,
			String speciality) {
		super(name, email, gender, age, phoneNumber, yearsOfExperience, speciality);
		
	}





	public int getBonus() {
		return Bonus;
	}

	public void setBonus(int bonus) {
		Bonus = bonus;
	}

	public int getDeduction() {
		return deduction;
	}

	public void setDeduction(int deduction) {
		this.deduction = deduction;
	}
	

	public static int getFullCountCoaches() {
		return countFullCoaches;
	}
	
	@Override
	protected int calc_Salary() {
		
		return ((Basic_Salary + Bonus) - deduction);
	}

	@Override
	protected String getDetails() {
		
		return super.getDetails();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
