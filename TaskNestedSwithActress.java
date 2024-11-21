package Allprogram;

import java.util.Scanner;

public class TaskNestedSwithActress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        String actressChoice = sc.next(); // Input for actor choice

        switch (actressChoice) {
            case "Samantha": // Rajini's movies
            	System.out.println("You selected Samantha. Choose a pair:");
            	String SamanthaPair = sc.next(); // Input for movie choice
                switch (SamanthaPair) {
                    case "Vijay":
                        System.out.println("Mersal");
                        break;
                    case "Surya":
                        System.out.println("24");
                        break;
                    case "Allu arjun":
                        System.out.println("Pushpa");
                        break;
                    case "Nani":
                        System.out.println("Nani");
                        break;
                        
                    default:
                        System.out.println("Invalid movie choice.");
                }
                break;

            case "Kajal": // Vijay's movies
                System.out.println("You selected Kajal. Choose a pair:");

                String Kajalpair= sc.next(); // Input for movie choice
                switch (Kajalpair) {
                    case "Vijay":
                        System.out.println("Thuppakki");
                        break;
                    case "Surya":
                        System.out.println("Matran");
                        break;
                    case "Ajith":
                        System.out.println("Viveagam");
                        break;
                    case "Karthi":
                        System.out.println("Alaguraja");
                        break;

                    default:
                        System.out.println("Invalid movie choice.");
                }
                break;

            case "Thamana": // Kamal's movies
                System.out.println("You selected Thamana. Choose a pair:");

                String Thamanapair = sc.next(); // Input for movie choice
                switch (Thamanapair) {
                    case "Vijay":
                        System.out.println("Sura");
                        break;
                    case "Surya":
                        System.out.println("Ayan");
                        break;
                    case "Karthi":
                        System.out.println("thola");
                        break;
                    case "Ajith":
                        System.out.println("Veeram");
                        break;
                    
                    default:
                        System.out.println("Invalid movie choice.");
                }
                break;

            default:
                System.out.println("Invalid actress choice.");
        }


	}

}
