package tdd;

public class Bike {
    private boolean power;
    private int speed;

    public void setPower(boolean powerOn) {

        this.power = powerOn;
    }

    public boolean getPower() {

        return power;
    }

    public void Accelerate() {
        if (speed <= 20) {
            speed = speed + 1;
        }
        if (speed >= 21 && speed <= 30) {
            speed = speed + 2;
        }
        if (speed >= 31 && speed <= 40) {
            speed = speed + 3;
        }
        if (speed >= 41) {
            speed = speed + 4;
        }
    }
/*
    public void AccelerateGearTwo() {
        if (speed > 20 && speed <= 29) {
            speed = speed + 2;
        }
    }

    public void AccelerateGearThree() {
        if (speed >=30 && speed <= 37) {
            speed = speed + 3;
        }
    }

    public void AccelerateGearFour() {
        if (speed >= 40) {
            speed = speed + 4;
        }
    }
*/


    public void setSpeed(int speed) {

        this.speed = speed;
    }
    public int getSpeed() {

        return speed;
    }


    public void Brake() {
        if (speed > 0 && speed <= 20) {
            speed = speed - 1;
        }
        if (speed >= 21 && speed <= 30) {
            speed = speed - 2;
        }
        if (speed >= 31 && speed <= 40) {
            speed = speed - 3;
        }
        if (speed >= 41) {
            speed = speed - 4;
        }
    }
/*
    public void DecelerateGearTwo() {
        if (speed >= 22 && speed <=30) {
            speed = speed - 2;
        }
    }

    public void DecelerateGearThree() {
        if (speed <= 40 && speed >=33)
        speed = speed - 3;
    }

    public void DecelerateGearFour() {
        if (speed > 44)
        speed = speed - 4;
    }
*/
}