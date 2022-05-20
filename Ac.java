package tdd;

public class Ac {
    private boolean power;
    private int temperature = 16;

    public boolean getPower() {
        return power;
    }

    public void setPower(boolean value) {
        power = value;
    }

    public void increaseTemperature() {
        if (temperature < 30){
        temperature = temperature + 1;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16)
        temperature = temperature - 1;
    }
}
/*
    private boolean power;

    private int temperature;

    public void setPower(boolean on) {
        power = on;
    }
    public boolean getPower() {
        return power;
    }

    public int setTemperature(int temperature)

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature() {
    }    */

