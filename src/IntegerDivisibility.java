import java.util.Scanner;

/**
 * Homework2 - 3.26: Checks entered integer's divisibility by 5 and 6
 * 
 * CIS2571-002
 * @author Darryl Karney
 * @version 10Jun2018
 */

public class IntegerDivisibility {

	public static void main(String[] args) {
		//Initiate variables
		Scanner input = new Scanner(System.in);
		int value;
		boolean and, or, xor;
		
		//Get user input
		System.out.println("Enter an integer: ");
		value = input.nextInt();
		
		//Calculate divisibility
		if (value % 5 == 0 && value % 6 == 0) {
			and = true;
		} else {
			and = false;
		}
		
		if (value % 5 == 0 || value % 6 == 0) {
			or = true;
		} else {
			or = false;
		}
		
		if (value % 5 == 0 ^ value % 6 == 0) {
			xor = true;
		} else {
			xor = false;
		}
			
		//Display results
		System.out.println("Is 10 divisible by 5 and 6? " + and);
		System.out.println("Is 10 divisible by 5 or 6? " + or);
		System.out.println("Is 10 divisible by 5 or 6, but not both? " + xor);
	}

}
