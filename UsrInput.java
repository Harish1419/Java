package Allprogram;

import java.util.Scanner;
//polymorphism 
public class UsrInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Scanner class is used to get the input from the user
		//its is available in java,util package 
		////nextLong()---read long value from the user 
		//nextLine()---reads string from the user
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name");
		//string input
		String name=obj.nextLine();
		//Numerical output
		System.out.println("enter Age");
		int age=obj.nextInt();
		System.out.println("enter Salary");
		double salary=obj.nextDouble();
		//output
		System.out.println("name "+name);
		System.out.println("Age "+age);
		System.out.println("Salary "+salary);
		
		
	}

}
