package GymManagmentSystem;
import java.util.*;

public class Managment {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Would you like to register a Coach or a Client ?");
        String Member_Type = s.nextLine().toUpperCase();
        
        while (!Member_Type.equalsIgnoreCase("Client") && !Member_Type.equalsIgnoreCase("Coach")) {
        	System.out.println("Please enter Coach or Client...");
        	Member_Type = s.next().toUpperCase();
        }
        
        if (Member_Type.equals("CLIENT")) {
            Client c = new Client();
        }
        else if (Member_Type.equals("COACH")){
        	
            System.out.println("FullTime or PartTime ?");
            String CoachType = s.next();
             s.nextLine();
            
            while (!CoachType.equalsIgnoreCase("FullTime") && !CoachType.equalsIgnoreCase("PartTime")) {
            	System.out.println("Please enter FullTime or PartTime...");
            	CoachType = s.nextLine().toUpperCase();
            }
            
            if(CoachType.equalsIgnoreCase("FullTime")) {
            	FullTimeCoach ftp = new FullTimeCoach();
            }
            else if (CoachType.equalsIgnoreCase("PartTime")) {
            	PartTimeCoach ptp = new PartTimeCoach();
            	
            	
            }
        }
	}

}


