package Allprogram;
import java.util.Scanner;
public class TaskAverageThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double[] marks = new double[5];

        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextDouble();
        }

        Thread averageThread = new Thread(new Runnable() {
            @Override
            public void run() {
                double total = 0;
                for (double mark : marks) {
                    total += mark;
                }
                double average = total / marks.length;
                System.out.println("Average: " + average);
            }
        });

        averageThread.start();

	}

}
