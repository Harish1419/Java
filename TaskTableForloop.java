package Allprogram;

import java.util.Scanner;

public class TaskTableForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int table=obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"X"+table+"="+i*table);
		}

	}

}
