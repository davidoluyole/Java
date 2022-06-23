package chapter2;    // With respect to Fig. 2.15 Comparison.java
//an application that inputs three integers from the user and
//displays the sum, average, product, smallest and largest of the numbers

import java.util.Scanner; // program uses class Scanner

    public class Answer2_17{
// main method begins execution of Java application

        public static void main(String[] args) {
// create Scanner to obtain input from command line

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer: "); // prompt
            int number1 = input.nextInt(); // read first number from user

            System.out.print("Enter second integer: "); // prompt
            int number2 = input.nextInt(); // read second number from user

            System.out.print("Enter second integer: "); // prompt
            int number3 = input.nextInt(); // read second number from user

            int sum = number1 + number2 + number3;

            float average = sum / 3;

            int product = number1 * number2 * number3;

            System.out.printf("The sum of %d, %d and %d is %d%n", number1, number2, number3, sum);
            System.out.printf("The average of %d, %d and %d is %.0f%n", number1, number2, number3, average);
            System.out.printf("The product of %d, %d and %d is %d%n", number1, number2, number3, product);

            if (number1 < number2 && number1 < number3) {
                System.out.printf("The smallest number is %d%n", number1);
            }

		    if (number2 < number3 && number2 < number1) {
                System.out.printf("The smallest number is %d%n", number2);
            }
		    if (number3 < number2 && number3 < number1) {
                System.out.printf("The smallest number is %d%n", number3);
            }
		    if (number1 > number2 && number1 > number3) {
                System.out.printf("The largest number is %d%n", number1);
            }
		    if (number2 > number3 && number2 > number1) {
                System.out.printf("The largest number is %d%n", number2);
            }
		    if (number3 > number2 && number3 > number1) {
                System.out.printf("The largest number is %d%n", number3);
            }
        } // end method main
    } // end class Comparison