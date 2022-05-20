package tdd;
import java.util.Scanner;
import java.lang.Math;

public class Hypotenuse {
    public static void main(String[] args){

        Scanner sides = new Scanner(System.in);

        System.out.println("Please enter the length of the first side (adjacent): ");
        double opposite = sides.nextDouble();

        System.out.println("Please enter the length of the second side (Opposite): ");
        double adjacent = sides.nextDouble();

        double hypotenuseSquared = Math.pow(opposite, 2) + Math.pow(adjacent, 2);

        double hypotenuse = Math.sqrt(hypotenuseSquared);

        System.out.printf("The Hypotenuse of the Triangle is %.2f\n", hypotenuse);

    }
}
