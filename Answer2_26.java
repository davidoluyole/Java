import java.util.Scanner;

public class Answer2_26{

	public static void main(String... Args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number : ");

	int a = input.nextInt();

	System.out.print("Enter number : ");

	int b = input.nextInt();

	float c = a * 3;

	float d = b * 2;

	float e = d % c;

	if ( e == 0 ){

	System.out.printf("%d tripled is a multiple of %d doubled", a, b);

	}

	}

}