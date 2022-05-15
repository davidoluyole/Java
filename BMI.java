import java.util.Scanner;

public class BMI{

	public static void main(String... dave){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds: ");

	Double P = input.nextDouble();

	Double K = P * 0.45359237;

	System.out.print("Enter height in inches: ");

	Double I = input.nextDouble();

	Double M = I * 0.0254;	

	Double B = K / ( M * M );

	System.out.printf("BMI is %.4f ", B);

	}

}