package chapter2;// Fig. 2.7: techniques
// Addition program that inputs two numbers then displays the square of each, the sum of their squares, 
//and the difference of the squares (firstnumber squared minus the second number squared).
import java.util.Scanner; // program uses class Scanner

public class Answer2_15{
	// main method begins execution of Java application
	public static void main(String[] args) {
	// create a Scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: "); // prompt
	int number1 = input.nextInt(); // read first number from user

	System.out.print("Enter second integer: "); // prompt
	int number2 = input.nextInt(); // read second number from user

	int square1 = number1 * number1; // square numbers, then store total in square1
	int square2 = number2 * number2; // square numbers, then store total in square2

	int sum = square1 + square2; // add numbers, then store total in sum

	int minus = square1 - square2; // subtract numbers, then store total in minus

	System.out.printf("the square of %d and %d  is %d and %d%n", number1, number2, square1, square2); // display squares
	System.out.printf("Sum of their squares is %d%n", sum); // display sum
	System.out.printf("Difference of the squares is %d", minus); // display minus

	} // end method main
} // end class Addition
