import java.util.Scanner;

public class FeetConverter{

	public static void main(String... dave){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value for feet: ");

	double F = input.nextDouble();

	double M = F * 0.305;

	System.out.printf("%.1f feet is %.4f meters", F, M);

	}

}