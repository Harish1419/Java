package Allprogram;

public class RelationalAndLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		boolean x = true, y = false;

        // Relational operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        
        // Logical operators
        System.out.println("x && y: " + (x && y)); // AND
        System.out.println("x || y: " + (x || y)); // OR
        System.out.println("!x: " + (!x));         // NOT
        

	}

}
