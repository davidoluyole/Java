import java.util.Scanner;

public class Answer2_30{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number consisting of five digits: ");

	int n = input.nextInt();

	int n1 = n / 10000;

	int n2 = (n % 10000) / 1000;

	int n3 = ((n % 10000) % 1000) / 100;

	int n4 = (((n % 10000) % 1000) % 100) / 10;

	int n5 = (((n % 10000) % 1000) % 100) % 10;

	System.out.printf("%d  %d  %d  %d  %d", n1, n2, n3, n4, n5);

	}
}