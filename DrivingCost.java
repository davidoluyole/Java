import java.util.Scanner;

public class DrivingCost{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the driving distance: ");

	float D = input.nextFloat();

	System.out.print("Enter miles per gallon: ");

	float M = input.nextFloat();

	System.out.print("Enter price per gallon: ");

	float P = input.nextFloat();

	float C = D / M * P;

	System.out.printf("The cost of driving is $%.2f", C);

	}

}