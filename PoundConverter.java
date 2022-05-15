import java.util.Scanner;

public class PoundConverter{
	public static void main(String[] dave){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter a number in pounds: ");

	double P = input.nextDouble();

	double X = P * 0.454 ;

	System.out.printf("%.1f Pounds is %.3f Kilograms", P, X);
	}
}