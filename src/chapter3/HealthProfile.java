package chapter3;

import java.text.DecimalFormat;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int heightInInches;
    private int weightInPounds;
    private int currentDay;
    private int currentMonth;
    private int currentYear;

    public HealthProfile(String firstname, String lastname,
                         String gender, int birthDay,
                         int birthMonth, int birthYear,
                         int heightInInches, int weightInPounds,
                         int currentDay, int currentMonth,
                         int currentYear) {
        this.firstName=firstname;
        this.lastName=lastname;
        this.gender=gender;
        this.birthYear=birthYear;
        this.birthMonth=birthMonth;
        this.birthDay=birthDay;
        this.heightInInches=heightInInches;
        this.weightInPounds=weightInPounds;
        this.currentDay =currentDay;
        this.currentMonth = currentMonth;
        this.currentYear = currentYear;
    }
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setGender(String gender){this.gender= gender;}

    public void setDayOfBirth(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setMonthOfBirth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setYearOfBirth(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setHeightInInches(int heightInInches){this.heightInInches = heightInInches;}

    public void setWeightInPounds(int weightInPounds){this.weightInPounds = weightInPounds;}

    public void setCurrentDay(int currentDay){this.currentDay=currentDay;}

    public void setCurrentMonth(int currentMonth){this.currentMonth=currentMonth;}

    public void setCurrentYear(int currentYear){this.currentYear=currentYear;}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender(){return gender;}

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() { return birthYear;}

    public int getCurrentDay(){return currentDay;}

    public int getCurrentMonth(){return currentMonth;}

    public int getCurrentYear(){return currentYear;}

    public int getHeightInInches(){return heightInInches;}

    public int getWeightInPounds(){return weightInPounds;}

    public String getDob(){
        return getBirthDay() + ":" + getBirthMonth() + ":" + getBirthYear();
    }

    public int getAge() {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31};
        if (getBirthDay()>getCurrentDay()){
            currentMonth = getCurrentMonth()-1;
            currentDay = getCurrentDay() + months[getBirthMonth()-1];
        }
        if (getBirthMonth()>getCurrentMonth()){
            currentYear = getCurrentYear()-1;
            currentMonth = getCurrentMonth() + 12;
        }

        return getCurrentYear()-getBirthYear();
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        int fiftyPercent = getMaximumHeartRate()/2;
        int eightyFivePercent = getMaximumHeartRate()* 85 / 100;

        return fiftyPercent +" - "+ eightyFivePercent +" beats per minute(BPM) ";
    }

    public String getBMI(){
        double Kg = weightInPounds * 0.45359237;
        double M = heightInInches * 0.0254;
        double bmi = Kg / ( M * M );

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        return df.format(bmi);
    }
    public String getChart(){
        return """
                Underweight = <18.5\s
                Normal weight = 18.5-24.9\s
                Overweight = 25-29.9\s
                Obesity = BMI of 30 or greater""";
    }
    public String getOutput() {
        return "\nYour Records: " +
                "\n" +
                "\nFirstname: "+ getFirstName() +
                "\nLastname: " + getLastName() +
                "\nGender: " + getGender() +
                "\nDate Of Birth: " + getDob() +
                "\nHeight in Inches: " + getHeightInInches() +
                "\nWeight in Pounds: " + getWeightInPounds() +
                "\nAge: " + getAge() +
                "\nBMI: " + getBMI() +
                "\nMaximum Heart Rate: " + getMaximumHeartRate() +
                "\nTarget Heart Rate: " + getTargetHeartRate() +
                "\n" +
                "\nBMI CHART\n" + getChart();
    }
}
