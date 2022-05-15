import java.util.Scanner;

public class Answer2_34{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the current world population: ");

	long p = input.nextLong();

	System.out.println("Enter the world population growth rate: ");

	float r = input.nextFloat();

	double a = (p * (r / 100)) + p;
	double b = (a * (r / 100)) + a;
	double c = (b * (r / 100)) + b;
	double d = (c * (r / 100)) + c;
	double e = (d * (r / 100)) + d;

	System.out.printf("The world population ater one year is %.0f%n", a);
	System.out.printf("The world population ater two year is %.0f%n", b);
	System.out.printf("The world population ater three year is %.0f%n", c);
	System.out.printf("The world population ater four year is %.0f%n", d);
	System.out.printf("The world population ater five year is %.0f%n", e);
	}
}	