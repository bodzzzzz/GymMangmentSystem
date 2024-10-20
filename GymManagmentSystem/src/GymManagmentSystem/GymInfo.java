package GymManagmentSystem;

import java.util.ArrayList;

public class GymInfo {

	static String Gym_Name="SIM_GYM";
    static String Gym_Email="SIM_GYM@gmail.com";
    static String Location="ElShatby-Alexandria-Egypt";
    static int Max_Member=100;
    static String Opened_Hours="24/7 && also opened in The weekends";
    

    public static void Display_GymInfo() {
        System.out.println("Gym_Name: "+Gym_Name);
        System.out.println("Gym_Email: "+Gym_Email);
        System.out.println("Location: "+Location);
        System.out.println("Max_Member: "+Max_Member);
        System.out.println("Opened_Hours: "+Opened_Hours);
        System.out.println("NUmber of clients : "+ Client.getCountClients());
        System.out.println("Number of full time coaches : "+FullTimeCoach.getFullCountCoaches());
        System.out.println("Number of Part time coaches : "+PartTimeCoach.getPartCountCoaches());

 }
    
  /*  protected void Registered_clients_Details() {
    	for (Client client : clientArray) {
            System.out.println("Name: " + client.getName());
            System.out.println("Email: " + client.getEmail());
            System.out.println("Gender: " + client.getGender());
            System.out.println("Age: " + client.getAge());
            System.out.println("Phone Number: " + client.getPhoneNumber());
            System.out.println();
        
        
        }
    }
    
    protected void Registered_ftp_coaches() {
    	Ftp_Array.add(new FullTimeCoach("ahmed" , "ujrethdjkhjl;uy" , "hjkgh" , 23 , 90877 , 5 , "Calisthenics"));
	    Ftp_Array.add(new FullTimeCoach("karim" , "ujrethdjkhjl;uy" , "hjkgh" , 68 , 90877 , 3 , "bodybuilding"));
	    Ftp_Array.add(new FullTimeCoach("tony" , "ujrethdjkhjl;uy" , "hjkgh" , 45 , 90877 , 5 , "Calisthenics"));
	    
    	for (FullTimeCoach ftp : Ftp_Array) {
            System.out.println("Name: " + ftp.getName());
            System.out.println("Email: " + ftp.getEmail());
            System.out.println("Gender: " + ftp.getGender());
            System.out.println("Age: " + ftp.getAge());
            System.out.println("Phone Number: " + ftp.getPhoneNumber());
            System.out.println();
        
        
        }
    }
    protected void Registered_Ptp_coaches() {
    	for (PartTimeCoach Ptp : Ptp_Array) {
            System.out.println("Name: " + Ptp.getName());
            System.out.println("Email: " + Ptp.getEmail());
            System.out.println("Gender: " + Ptp.getGender());
            System.out.println("Age: " + Ptp.getAge());
            System.out.println("Phone Number: " + Ptp.getPhoneNumber());
            System.out.println();
        
        
        }
    }*/
}