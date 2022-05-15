import java.util.Scanner;

public class CompoundValue{

	public static void main(String... dave){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the monthly saving amount: ");

	double S = input.nextDouble();

	double B1 = S * (1 + 0.00417);

	double B2 = (S + B1) * (1 + 0.00417);

	double B3 = (S + B2) * (1 + 0.00417);

	double B4 = (S + B3) * (1 + 0.00417);

	double B5 = (S + B4) * (1 + 0.00417);

	double B6 = (S + B5) * (1 + 0.00417);

	System.out.printf("After the sixth month, the account value is %.2f%n", B6 );

	}

}