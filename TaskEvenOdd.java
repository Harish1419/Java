package Allprogram;

public class TaskEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= 20; i += 2) {
                    System.out.println("Even: " + i);
                }
            }
        });

        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 19; i += 2) {
                    System.out.println("Odd: " + i);
                }
            }
        });

        evenThread.start();
        oddThread.start();

	}

}
