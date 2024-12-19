package Allprogram;
import java.util.Scanner;
public class TaskDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        // Get date input from the user
	        System.out.println("Enter date (YYYY MM DD):");
	        int year = scanner.nextInt();
	        int month = scanner.nextInt();
	        int day = scanner.nextInt();
	        
	        year += 4;
	        month += 4;
	        day += 4;
	        
	        if(month>12||day>31)
	        {
	        	System.out.println("Invalid After Addition");
	        }
	        
	     // Validate date
	        else if (month < 1 || month > 12 || day < 1 || day > 31) {
	            System.out.println("Invalid date!");
	            return;
	        }
	        
	        else
	        {
	        
	        System.out.println("Local Date: " + year + "-" + (month < 10 ? "0" : "") + month + "-" + (day < 10 ? "0" : "") + day);
	        }
	}

}
