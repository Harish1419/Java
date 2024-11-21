package Allprogram;

import java.util.Scanner;

public class SwitchInForEach {
    enum course { JAVA, AI, ML }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to select a course
        System.out.println("Please choose a course: JAVA, AI, or ML");
        String userInput = sc.next().toUpperCase(); // Convert input to uppercase for matching

        // Check if the input matches any of the enum values
        boolean isValid = false;
        for (course c : course.values()) {
            if (c.name().equals(userInput)) {
                // If input matches enum, perform the switch
                isValid = true;
                switch (c) {
                    case JAVA:
                        System.out.println("Java is always powerful");
                        break;
                    case AI:
                        System.out.println("AI is always powerful");
                        break;
                    case ML:
                        System.out.println("ML is always powerful");
                        break;
                }
                break; // Exit the loop after finding the match
            }
        }

        // If input was invalid
        if (!isValid) {
            System.out.println("Invalid course name. Please enter JAVA, AI, or ML.");
        }

    }
}