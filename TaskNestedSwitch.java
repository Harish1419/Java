package Allprogram;
import java.util.Scanner;
public class TaskNestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub Scanner sc = new Scanner(System.in);
		
        Scanner sc = new Scanner(System.in);

        String actorChoice = sc.next(); // Input for actor choice

        switch (actorChoice) {
            case "Rajini": // Rajini's movies
                
            	String rajiniMovie = sc.next(); // Input for movie choice
                switch (rajiniMovie) {
                    case "Enthiran":
                        System.out.println("Enthiran is a blockbuster!");
                        break;
                    case "Sivaji":
                        System.out.println("Sivaji is a blockbuster!");
                        break;
                    case "Darbar":
                        System.out.println("Darbar was a flop.");
                        break;
                    case "Baba":
                        System.out.println("Baba was a flop.");
                        break;
                    case "Kaala":
                        System.out.println("Kaala was a blockbuster!.");
                        break;
                    default:
                        System.out.println("Invalid movie choice.");
                }
                break;

            case "Vijay": // Vijay's movies
                System.out.println("You selected Vijay. Choose a movie:");

                String vijayMovie = sc.next(); // Input for movie choice
                switch (vijayMovie) {
                    case "Thuppakki":
                        System.out.println("Thuppakki is a blockbuster!");
                        break;
                    case "Mersal":
                        System.out.println("Mersal is a blockbuster!");
                        break;
                    case "Beast":
                        System.out.println("Beast was a flop.");
                        break;
                    case "Sura":
                        System.out.println("Sura was a flop.");
                        break;
                    case "Sarkar":
                        System.out.println("Sarkar is a blockbuster!");
                        break;
                    default:
                        System.out.println("Invalid movie choice.");
                }
                break;

            case "Kamal": // Kamal's movies
                System.out.println("You selected Kamal. Choose a movie:");

                String kamalMovie = sc.next(); // Input for movie choice
                switch (kamalMovie) {
                    case "Vishwaroopam":
                        System.out.println("Vishwaroopam is a blockbuster!");
                        break;
                    case "Indian":
                        System.out.println("Indian is a blockbuster!");
                        break;
                    case "Hey Ram":
                        System.out.println("Hey Ram was a flop.");
                        break;
                    case "Vikram":
                        System.out.println("Vikram is a blockbuster!");
                        break;
                    case "Anbe Sivam":
                        System.out.println("Anbe Sivam is a flop");
                        break;
                    default:
                        System.out.println("Invalid movie choice.");
                }
                break;

            default:
                System.out.println("Invalid actor choice.");
        }


	}

}
