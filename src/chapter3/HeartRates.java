package chapter3;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int currentDay;
    private int currentMonth;
    private int currentYear;
    public HeartRates(String firstName,String lastName,
                      int birthDay, int birthMonth, int birthYear,
                      int currentDay, int currentMonth, int currentYear){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthYear=birthYear;
        this.birthMonth=birthMonth;
        this.birthDay=birthDay;
        this.currentDay =currentDay;
        this.currentMonth = currentMonth;
        this.currentYear = currentYear;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName =lastName;
    }

    public void setDayOfBirth(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setMonthOfBirth(int birthMonth) {
        this.birthMonth=birthMonth;
    }

    public void setYearOfBirth(int birthYear) {
        this.birthYear=birthYear;
    }
    public int getYear() {
        return birthYear;
    }

    public int getMonth() {
        return birthMonth;
    }

    public int getDay() {
        return birthDay;
    }
    public String getDob(){
        String dob = getDay() + ":" + getMonth() + ":" + getYear();
        return dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        int months[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31};
        if (birthDay>currentDay){
            currentMonth = currentMonth-1;
            currentDay = currentDay + months[birthMonth-1];
        }
        if (birthMonth>currentMonth){
            currentYear = currentYear-1;
            currentMonth = currentMonth + 12;
        }
        int day = currentDay-birthDay;
        int month = currentMonth-birthMonth;
        int year = currentYear-birthYear;

        String age = day +":"+month+":"+year;
        return year;
    }

    public int getMaximumHeartRate() {
        int maximunHeartRate = 220 - getAge();
        return maximunHeartRate;
    }

    public String getTargetHeartRate() {
        int fiftyPercent = getMaximumHeartRate()/2;
        int eightyFivePercent = getMaximumHeartRate()* 85 / 100;


        String targetHeartRate = fiftyPercent +" - "+ eightyFivePercent +" beats per minute(BPM) ";
        return targetHeartRate;
    }
}
