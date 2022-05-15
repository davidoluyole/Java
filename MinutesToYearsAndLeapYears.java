import java.util.Scanner;

public class MinutesToYearsAndLeapYears{
	
	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the number of minutes: ");

	double TotalMinutes = input.nextDouble();

	double YearsAndDays = TotalMinutes / ( 60 * 24 * 365 );

	int Years = (int) YearsAndDays;

	double YearsMinutes = Years * ( 60 * 24 * 365 );

	double YearsDaysMinutes = TotalMinutes - YearsMinutes;

	double YearsDays = YearsDaysMinutes / ( 60 * 24 );
	
	System.out.printf("%.0f minutes is approximately %d years and %.0f days\n", TotalMinutes, Years, YearsDays);

	double LeapYearsAndDays = TotalMinutes / ( 60 * 24 * 365.25 );

	int LeapYears = (int) LeapYearsAndDays;

	double LeapYearsMinutes = LeapYears * ( 60 * 24 * 365.25 );

	double LeapYearsDaysMinutes = (TotalMinutes - LeapYearsMinutes);

	double LeapYearsDays = LeapYearsDaysMinutes / ( 60 * 24 );

	System.out.printf("%.0f minutes is approximately %d years and %.0f days when considering leap years", TotalMinutes, LeapYears, LeapYearsDays);

	}

}
