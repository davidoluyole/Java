package chapter3;

import java.util.Scanner;

public class HealthProfileMain {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        HealthProfile healthProfile = new HealthProfile("", "",
                "", 0,0, 0, 0,
                0, 0, 0, 0 );

        System.out.println("Welcome! \nPlease enter your Firstname: ");
        String firstname = entry.nextLine();
        healthProfile.setFirstName(firstname);

        System.out.println("Please enter your Lastname: ");
        String lastname = entry.nextLine();
        healthProfile.setLastName(lastname);

        System.out.println("Please enter your gender: ");
        String gender = entry.nextLine();
        healthProfile.setGender(gender);

        System.out.println("Please enter your day of birth: ");
        int birthDay = entry.nextInt();
        healthProfile.setDayOfBirth(birthDay);

        System.out.println("Please enter your month of birth: ");
        int birthMonth = entry.nextInt();
        healthProfile.setMonthOfBirth(birthMonth);

        System.out.println("Please enter your year of birth: ");
        int birthYear = entry.nextInt();
        healthProfile.setYearOfBirth(birthYear);

        System.out.println("Please enter your height in inches: ");
        int heightInInches = entry.nextInt();
        healthProfile.setHeightInInches(heightInInches);

        System.out.println("Please enter your weight in pounds: ");
        int weightInPounds = entry.nextInt();
        healthProfile.setWeightInPounds(weightInPounds);

        System.out.println("Please enter current day's date: ");
        int currentDay = entry.nextInt();
        healthProfile.setCurrentDay(currentDay);

        System.out.println("Please enter current month: ");
        int currentMonth = entry.nextInt();
        healthProfile.setCurrentMonth(currentMonth);

        System.out.println("Please enter current year: ");
        int currentYear = entry.nextInt();
        healthProfile.setCurrentYear(currentYear);

        System.out.println(healthProfile.getOutput());
    }
}
