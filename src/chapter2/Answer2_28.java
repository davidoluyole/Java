package chapter2;

import java.util.Scanner;

public class Answer2_28{

	public static void main(String... Args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number : ");

	int r = input.nextInt();

	int d = 2 * r;

	double c = 2 * Math.PI * r;

	double a = Math.PI * r * r;

	System.out.printf("The Diameter of the Circle is %d", d);

	System.out.printf("The Circumference of the Circle is %f", c);

	System.out.printf("The Area of the Circle is %f", a);

	}

}