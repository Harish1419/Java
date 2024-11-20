package Allprogram;
import java.util.Scanner;
public class TaskPolynrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        
        if(input.equals(reversed))
        {
        	System.out.println("is a palindrome");
        }
        else
        {
        	System.out.println("not a polindrom");
        }
        
        

	}

}
