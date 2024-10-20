package GymManagmentSystem;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Scanner;

public class Client extends Person {

	
	Scanner input = new Scanner(System.in);
	static int countClients = 5;
    protected ArrayList <Client> clientArray = new ArrayList<>();
    protected ArrayList <FullTimeCoach> Ftp_Array = new ArrayList<>();
    protected ArrayList <PartTimeCoach> Ptp_Array = new ArrayList<>();
    
    	
    public Client() {
        int choice;
        boolean continueFlag;

        continueFlag = true;

        choice = 0;
        System.out.println("Welcome to SIM gym, " + super.getName() + "!");
        do {
            try {
                System.out.println(" What would you like to do?\n 1. Add Membership\n 2. Add Medical History\n 3. Choose a private coach\n 4. Choose a training field\n 5. Our Gym Info\n 6. Log out");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> AddMembership();
                    case 2 -> AddmedicalHistory();
                    case 3 -> AddPrivateCoach();
                    case 4 -> AddTrainingField();
                    case 5 -> GymInfo.Display_GymInfo();
                    case 6 -> continueFlag = false;
                }

            } catch (Exception e) {
                System.out.println("Enter valid input...");
                input.nextLine(); // Clear the input buffer
            }

        } while ( continueFlag ); // Continue the loop until the client chooses to log out
        countClients++;
        System.out.println("Thank you for visiting SIM gym ," + super.getName()+" ,Good Bye! ");
    }

	
	public Client(String name, String email, String gender, int age, long phoneNumber) {
		super(name, email, gender, age, phoneNumber);
	}

	protected void AddMembership() {
	    int period;
	    System.out.println("Choose a membership : ");
	    do {
	        try {
	            System.out.println("1. 1 Month \n2. 3 Months \n3. 12 Months");
	            period = input.nextInt();
	            if (period < 1 || period > 3) {
	                System.out.println("Please enter a number from 1 to 3...");
	                continue; // Continue the loop without executing further code
	            }
	            switch (period) {

	                case 1 -> System.out.println(super.getName() + " has registered a 1 Month membership!");
	                case 2 -> System.out.println(super.getName() + " has registered a 3 Month membership!");
	                case 3 -> System.out.println(super.getName() + " has registered a 1 Year membership!");
	                

	            }

	        } catch (Exception e) {
	            System.out.println("Enter valid input... (numerical value from 1 - 3)");
	            input.nextLine(); // Clear the input buffer
	            continue; // Skip the rest of the loop and start from the beginning
	        }
	        // Exit the loop if valid input is received
	        break;
	    } while (true);
	}

	
	protected void AddmedicalHistory() {
		
		try {
		    boolean flag = false; // Flag 
		    String inputInjured;
		    do {
		        if (!flag) 
		        {
		            System.out.println("Does the client have any past injuries? Y/N ");
		            inputInjured = input.next();
		         
		        	if (inputInjured.equalsIgnoreCase("Y")) 
		        	{
		            System.out.println("Please enter your injuries:");
		            String injuries = input.next();
		            System.out.println(super.getName() + " has " + injuries + " injuries , our gym will provide medical assistance when needed!\n");
		            flag = true;
		            break;
		        	
			        } else if (inputInjured.equalsIgnoreCase("N")) 
			        {
			            System.out.println(super.getName() + " has no injuries and won`t be needing medical assistance.\n");
			            flag = true;
			            break;
			        }
		        } 
		        else 
		        {
		            System.out.println("Please enter 'Yes' or 'No'.");
		            continue; // tells user  to input yes or no
		        }
		        // Break the loop if the right input is entered
		        
		        
		    } while (!flag); // Loop until a right input is entered
		    
		} catch (Exception e) {
		    System.out.println("An error occurred. Please try again.");
		    input.nextLine();
		}
	}
	
	
	protected void AddTrainingField() {
	    int Field;
		boolean flag=false;
	    try {
	        do {
	            System.out.println("Choose a Training Field (1 / 2 / 3):\n1. BodyBuilding\n2. Calisthenics\n3. Crossfit");
	            Field = input.nextInt();
	            switch (Field) {
	                case 1 -> System.out.println(super.getName() + " has chosen BodyBuilding ");
	                case 2 -> System.out.println(super.getName() + " has chosen Calisthenics ");
	                case 3 -> System.out.println(super.getName() + " has chosen Crossfit ");
	                default -> System.out.println("Please enter a numerical value from 1 - 3... ");
	            }
	        } while (Field < 1 || Field > 3);
	    } catch (Exception e) {
	        System.out.println("Enter valid input...");
	        input.nextLine(); // Clear the input buffer
	    }
	}

	protected void AddPrivateCoach() {
		boolean TrueInput = false;
		
		try {
			do {
	        
	            System.out.println("FullTime or PartTime? Full / Part ");
	            String coach_type = input.next().toUpperCase();
	            

	            if (coach_type.equals("FULL")) {
					Ftp_Array.add(new FullTimeCoach("ahmed" , "ujrethdjkhjl;uy" , "hjkgh" , 23 , 90877 , 5 , "Calisthenics"));
					Ftp_Array.add(new FullTimeCoach("karim" , "ujrethdjkhjl;uy" , "hjkgh" , 68 , 90877 , 3 , "bodybuilding"));
					Ftp_Array.add(new FullTimeCoach("tony" , "ujrethdjkhjl;uy" , "hjkgh" , 45 , 90877 , 5 , "Calisthenics"));

					System.out.println("Our FullTime coaches:");
	                for (FullTimeCoach coach : Ftp_Array) {
	                    System.out.println(coach.getName());
	                }
	                System.out.println("Choose a coach:");
	                String typeCoachChosen1 = input.next();
	                System.out.println("Client has chosen coach : " + typeCoachChosen1);
	                TrueInput = true;
	                

	                
	            } else if (coach_type.equals("PART")) {
					Ptp_Array.add(new PartTimeCoach("mohamed" , "ujrethdjkhjl;uy" , "hjkgh" , 32 , 90877 , 2 , "Calisthenics"));
					Ptp_Array.add(new PartTimeCoach("ahmed" , "ujrethdjkhjl;uy" , "hjkgh" , 55 , 90877 , 3 , "BodyBuilding"));
	                System.out.println("Our PartTime coaches:");
	                for (PartTimeCoach coach : Ptp_Array) {
	                    System.out.println(coach.getName());
	                }
	                System.out.println("Choose a coach:");
	                String typeCoachChosen2 = input.next();
	                System.out.println("Client has chosen coach : " + typeCoachChosen2);
	                TrueInput = true;
	            } else {
	                System.out.println("Error...");
	            }
	        
	     
			} while(!TrueInput);
		}
	        
	     catch (Exception e) {
	        System.out.println("An error occurred...enter valid input ");
	        input.nextLine();
	    }
	
	
	}
	
	
	protected void ExitSystem() {
		System.out.println("Thank you for visiting SIM gym! ");
		System.exit(0);
	}
	
	public static int getCountClients() {
		return countClients;
	}

	@Override
	protected String getDetails() {
		
		return '{' + " Name: " + super.getName() + "\n Gender: " + super.getGender() + "\n Email: " + super.getEmail() + "\n Phone_Number: " + super.getPhoneNumber() + "\n Age: " + super.getAge() + " " +'}';
	}
		
    
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

