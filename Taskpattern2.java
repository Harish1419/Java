package Allprogram;
import java.util.Scanner;
public class Taskpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines for the pattern: ");
        int n = scanner.nextInt();

        for (int i=1;i<=n;i++) {
            for (int j=n;j>=i;j--) {
                System.out.print(j);
            }
            System.out.println(); 
        }


	}

}
