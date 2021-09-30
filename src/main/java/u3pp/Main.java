package u3pp;

import java.util.Scanner;

/**
 * The main method makes a scanner, and prompts the user to enter a year. Once the user enters a year, a method determines whether
 or not that year is a leap year. If the user types the exact string "STOP" then the program will end.
 * 
 * @author Jacob Cho
 */

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //Creates a scanner
		String input = "";
		int year = 0;

		System.out.print("Enter a year (or enter STOP to end): ");
		input = scan.nextLine();

		while (!input.toUpperCase().equals("STOP")) {
			year = Integer.parseInt(input);

			if(LeapYear.isLeapYear(year) == true){
				System.out.println(year + " is a leap year");
			} else{
				System.out.println(year + " is not a leap year");
			}

			System.out.print("Enter a year (or enter STOP to end): ");
			input = scan.nextLine();
		}
		scan.close();
	}
}