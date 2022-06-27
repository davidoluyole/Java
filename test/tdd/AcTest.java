package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcTest {

    @Test
    public void TestAcOn() {
        //Given that i have an AC
        Ac lg = new Ac();
        //When i switch it on
        boolean power = lg.getPower();
        lg.setPower(true);
        //Check that it is on
        assertEquals(true, lg.getPower());
    }

    @Test
    public void TestAcOff() {
        //Given that i have an AC and it is on
        Ac lg = new Ac();
        //when i switch it off
        lg.setPower(false);
        //check tha it is off
        assertEquals(false, lg.getPower());
    }

    @Test
    public void TestTemperature() {
        //given that i have an AC and it is on
        Ac lg = new Ac();
        //when i check the temperature it is 16
        lg.getTemperature();
        //check that it is 16
        assertEquals(16, lg.getTemperature());

    }

    @Test
    public void TestTemperatureIncrease() {
        //Given that i have an AC and it is on
        Ac lg = new Ac();
        //when i increase temperature
        lg.increaseTemperature();
        //check that temperature increases
        assertEquals(17, lg.getTemperature());
    }

    @Test
    public void TestTemperatureDecrease() {
        //Given that i have an AC and it is on
        Ac lg = new Ac();
        //when i reduce temperature
        lg.decreaseTemperature();
        //check that temperature reduces
        assertEquals(16, lg.getTemperature());
    }

    @Test
    public void TestMaxDecrease() {
        //Given that i have an AC and it is on
        Ac lg = new Ac();
        //when i increase temperature doesn't go beyond 30
        lg.decreaseTemperature();
        //check that temperature is still 30
        assertEquals(16, lg.getTemperature());
    }

    @Test
    public void TestMaxIncrease() {
        //Given that i have an AC and it is on
        Ac lg = new Ac();
        //when i reduce temperature doesn't go beyond 16
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        //check that temperature is still 16
        assertEquals(30, lg.getTemperature());
    }
}
