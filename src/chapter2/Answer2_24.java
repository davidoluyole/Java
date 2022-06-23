package chapter2;

import java.util.Scanner;

public class Answer2_24{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter first number: ");
	int firstNumber = input.nextInt();
	System.out.println("Enter second number: ");
	int secondNumber = input.nextInt();
	System.out.println("Enter third number: ");
	int thirdNumber = input.nextInt();
	System.out.println("Enter fourth number: ");
	int fourthNumber = input.nextInt();
	System.out.println("Enter fifth number: ");
	int fifthNumber = input.nextInt();

	        if (firstNumber > secondNumber && firstNumber > thirdNumber ){
			if (firstNumber > fourthNumber && firstNumber > fifthNumber){
        			System.out.printf("%d is the largest number\n", firstNumber);
			}
        	}

		if (secondNumber > firstNumber && secondNumber > thirdNumber ){
			if (secondNumber > fourthNumber && secondNumber > fifthNumber){
        			System.out.printf("%d is the largest number\n", secondNumber);
			}
        	}

	        if (thirdNumber > firstNumber && thirdNumber > secondNumber){
			if (thirdNumber > fourthNumber && thirdNumber > fifthNumber){
        			System.out.printf("%d is the largest number\n", thirdNumber);
			}
        	}

	        if (fourthNumber > firstNumber && fourthNumber > secondNumber){ 
			if (fourthNumber > thirdNumber && fourthNumber > fifthNumber){
        			System.out.printf("%d is the largest number\n", fourthNumber);
			}
        	}

	        if (fifthNumber > firstNumber && fifthNumber > secondNumber){
			if (fifthNumber > thirdNumber && fifthNumber > fourthNumber){
        			System.out.printf("%d is the largest number\n", fifthNumber);
			}
        	}






	        if (firstNumber < secondNumber && firstNumber < thirdNumber){
			if (firstNumber < fourthNumber && firstNumber < fifthNumber){
        			System.out.printf("%d is the smallest number\n", firstNumber);
			}
        	}
        	if (secondNumber < firstNumber && secondNumber < thirdNumber){
			if (secondNumber < fourthNumber && secondNumber < fifthNumber){
        			System.out.printf("%d is the smallest number\n", secondNumber);
			}
        	}
        	if (thirdNumber < firstNumber && thirdNumber < secondNumber){
			if (thirdNumber < fourthNumber && thirdNumber < fifthNumber){
        			System.out.printf("%d is the smallest number\n", thirdNumber);
			}
        	}
        	if (fourthNumber < firstNumber && fourthNumber < secondNumber){
			if (fourthNumber < thirdNumber && fourthNumber < fifthNumber){
        			System.out.printf("%d is the smallest number\n", fourthNumber);
        		}
		}
        	if (fifthNumber < firstNumber && fifthNumber < secondNumber){
			if (fifthNumber < thirdNumber && fifthNumber < fourthNumber ){
        			System.out.printf("%d is the smallest number\n", fifthNumber);
			}
        	}
	}
}