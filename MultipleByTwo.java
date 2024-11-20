package Allprogram;

import java.util.Scanner;

public class MultipleByTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int v = obj.nextInt();
		if(v%2==0)
		{
			System.out.println(v+ " it is multiple of 2");
		}
		else
		{
			System.out.println(v+ " it is not multiple of 2");
		}

	}

}
