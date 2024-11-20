package Allprogram;

import java.util.Scanner;

public class TaskSquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Not a valid number");
        } else {
            int i = 0;
            while (i * i <= num) {
                if (i * i == num) {
                    System.out.println("It's a perfect square");
                    // Exit the program if perfect square is found
                    return; 
                }
                i++;
            }
            System.out.println("Not a perfect square");
        }
            
        
    }


}
