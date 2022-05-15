import java.util.Scanner;

public class Answer2_33{

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

	System.out.printf("Underweight = <18.5 \n Normal weight = 18.5–24.9 \n Overweight = 25–29.9 \n Obesity = BMI of 30 or greater");

	}

}