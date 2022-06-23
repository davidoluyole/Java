package chapter2;

import java.util.Scanner;

public class Answer2_25{

	public static void main(String... Args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter number : ");

	int a = input.nextInt();

	int b = 3;

	float c = a % b;

	if ( c == 0 ){

	System.out.printf("%d is divisible by 3", a);

	}

	}

}