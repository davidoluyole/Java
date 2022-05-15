import java.util.Scanner;

public class Answer2_35{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("The estimated number of stones is 2300000");
	System.out.println("The average weight in tons of each stone is 9.75 tons");
	System.out.println("The estimated number of years taken to build the pyramid 20 years");

	System.out.print("Enter Estimated number of stones used: ");

	int number = input.nextInt();

	System.out.print("Enter average weight in tons of each stone: ");

	double weight = input.nextDouble();

	System.out.print("Enter number of years taken to build the pyramid: ");

	int year = input.nextInt();

	double tower = year * number * weight;

//t=731,600,000,000

	int y = year;

	double w = number * weight;

	double by = w / y;

	System.out.printf("%.2f Tons of the total Pyramid weight %.0f Tons will be buit in a year%n", by, w);

	double bh = by / 8760;
	System.out.printf("%.2f Tons of the total Pyramid weight %.0f Tons will be buit in an hour%n", bh, w);
		
	double bm = bh / 60;

	System.out.printf("%.2f Tons of the total Pyramid weight %.0f Tons will be buit in an minute%n", bm, w);

	}

}