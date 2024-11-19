package Allprogram;

import java.util.Scanner;

public class TaskArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int originalNum = num; 
        int numDigits = String.valueOf(num).length();  
        int sum = 0;

        
        while (num > 0) {
            int digit = num % 10;  
            int power = 1;  

            
            for (int i = 1; i <= numDigits; i++) {
                power *= digit;
            }

            sum += power;  
            num = num / 10;  
        }

        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

		
	}
		

}
