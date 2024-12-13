package Allprogram;

import java.util.Scanner;

public class TaskPranmitPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();

	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            // Move to the next line
	            System.out.println();
	        }

	}

}
