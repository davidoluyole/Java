// With respect to Fig. 2.15, Answer16.java
// an application that asks the user to enter one integer, obtains it from the user
// and displays whether the number and its square are greater than, equal to, 
//not equal to, or less than the number 100.

import java.util.Scanner; // program uses class Scanner

public class Answer2_16{
// main method begins execution of Java application

	public static void main(String[] args) {
// create Scanner to obtain input from command line

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: "); // prompt
	int number1 = input.nextInt(); // read first number from user

	int square1 = number1 * number1;

		
		if (number1 > 100) {
			System.out.printf("%d > %d%n", number1, 100);
		}
		if (number1 == 100) {
			System.out.printf("%d == %d%n", number1, 100);
		}
		if (number1 != 100) {
			System.out.printf("%d != %d%n", number1, 100);
		}
		if (number1 < 100) {
			System.out.printf("%d < %d%n", number1, 100);
		}
		if (square1 > 100) {
			System.out.printf("%d > %d%n", square1, 100);
		}
		if (square1 == 100) {
			System.out.printf("%d == %d%n", square1, 100);
		}
		if (square1 != 100) {
			System.out.printf("%d != %d%n", square1, 100);
		}
		if (square1 < 100) {
			System.out.printf("%d < %d%n", square1, 100);
		}
	} // end method main
} // end class Comparison