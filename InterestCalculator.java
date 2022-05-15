import java.util.Scanner;

public class InterestCalculator{

	public static void main(String...args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");

	float B = input.nextFloat();

	float I = input.nextFloat();

	float Mi = B * I / 1200;

	System.out.printf("The interest is %.5f", Mi);

	}

}