package tdd;
import java.util.Scanner;

public class OutputSumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        String output = """
                Enter a positive integer and 0 to indicate end of input
                """;
        System.out.println(output);
        int number = entry.nextInt();

        while ( number != 0 ){
            if(number % 2 == 0){
                evenSum += number;
                }
            if (number % 2 != 0){
                oddSum += number;
            }

            System.out.println(output);
            number = entry.nextInt();
        }
        System.out.println("The sum of Even numbers is " +evenSum + ", The sum of the Odd Numbers is " +oddSum);
    }
}
