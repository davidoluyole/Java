package chapter2;

import java.util.Scanner;

public class Answer2_32{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter five numbers: ");

	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	int d = input.nextInt();
	int e = input.nextInt();

	int positive = 0;
	int negative = 0;
	int zero = 0;

	if (a < 0){
	negative = negative + 1;
	}
	if (a > 0){
	positive = positive + 1;
	}
	if (a == 0){
	zero = zero + 1;
	}

	if (b < 0){
	negative = negative + 1;
	}
	if (b > 0){
	positive = positive + 1;
	}
	if (b == 0){
	zero = zero + 1;
	}

	if (c < 0){
	negative = negative + 1;
	}
	if (c > 0){
	positive = positive + 1;
	}
	if (c == 0){
	zero = zero + 1;
	}

	if (d < 0){
	negative = negative + 1;
	}
	if (d > 0){
	positive = positive + 1;
	}
	if (d == 0){
	zero = zero + 1;
	}

	if (e < 0){
	negative = negative + 1;
	}
	if (e > 0){
	positive = positive + 1;
	}
	if (e == 0){
	zero = zero + 1;
	}

	System.out.printf("The number of negative numbers are %d%n", negative);
	System.out.printf("The number of positive numbers are %d%n", positive);
	System.out.printf("The number of zeros are %d%n", zero);

	}
}