import java.lang.Math;
import java.util.Scanner;

public class FutureInvestmentValue{

	public static void main(String... dave){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter investment amount: ");

	double A = input.nextDouble();

	System.out.print("Enter annual interest rate in percentage: ");

	double I = input.nextDouble();

	System.out.print("Enter number of years: ");

	double Y = input.nextDouble();

	double V = A * Math.pow((1 + (I/1200)), (Y * 12));

	System.out.printf("Accumulated value is %.2f", V);

	}

}