
import java.util.Scanner; //imports scanner class from java util folder

public class EnergyCalculator{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	

		System.out.print("Enter the amount of water in kilograms: ");
		float M = input.nextFloat();

		System.out.print("Enter the initial temperature: ");
		float initialTemperature = input.nextFloat();

		System.out.print("Enter the final temperature: ");
		float finalTemperature = input.nextFloat();

		float Q = M * (finalTemperature - initialTemperature) * 4184 ;

		System.out.printf("The energy needed is %.1f%n", Q );

	}
}