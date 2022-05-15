import java.util.Scanner;
import java.lang.Math;

public class TriangleArea{

	public static void main(String... dave){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter three points for a triangle: ");

	double a1 = input.nextDouble();
	double b1 = input.nextDouble();
	double a2 = input.nextDouble();
	double b2 = input.nextDouble();
	double a3 = input.nextDouble();
	double b3 = input.nextDouble();

	double s1 = Math.sqrt( ((a2-a1) * (a2-a1)) + ((b2-b1) * (b2-b1)) );
	double s2 = Math.sqrt( ((a3-a2) * (a3-a2)) + ((b3-b2) * (b3-b2)) );
	double s3 =  Math.sqrt( ((a1-a3) * (a1-a3)) + ((b1-b3) * (b1-b3)) );

	double r = (s1 + s2 + s3)/2;

	double b = Math.sqrt( r * (r - s1) * (r - s2) * (r - s3));

	System.out.printf("The area of the triangle is %.1f ", b);

	}

}