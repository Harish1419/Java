package Allprogram;
import java.util.Scanner;
public class TaskTryeception {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is Even.");
            } else {
                System.out.println(num + " is Odd.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } 
    }

}
