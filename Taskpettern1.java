package Allprogram;
import java.util.Scanner;
public class Taskpettern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines for the pattern: ");
        int n = scanner.nextInt();

        for (int i=1;i<= n;i++) {
            for (int j = n-i+1;j >= 1;j--) {
                System.out.print(i);
            }
            System.out.println(); 
        }

	}

}
