import java.util.Scanner;

public class MinutesToYears{
	
	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of minutes: ");

	float M = input.nextFloat();

	float Y = M / ( 60 * 24 * 365 );

	int Z = (int) Y;

	float R = Z * ( 60 * 24 * 365 );

	float MR = M - R;

	float D = MR / ( 60 * 24 );
	
	System.out.printf("%.0f minutes is approximately %d years and %.0f days", M, Z, D);
	}

}