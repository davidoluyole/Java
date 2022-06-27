package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void BikeCanBeTurnedOn() {

        //Given that i have a bike
        Bike harleyDavidson = new Bike();
        //when i tun on the bike
        harleyDavidson.setPower(true);
        //Check that the bike is on
        assertEquals(true, harleyDavidson.getPower());
    }

    @Test
    public void BikeCanBeTurnedOff() {
        //Given That i have a bike and it is on
        Bike suzuki = new Bike();
        //When i put it off
        suzuki.setPower(false);
        //Check that it is off
        assertEquals(false, suzuki.getPower());

    }

    @Test
    public void BikeCanBeAccelerated() {
        //Given that i have a bike and it is on
        Bike jincheng = new Bike();
        // when i accelerate
        jincheng.Accelerate();
        //check that speed changes
        assertEquals(1, jincheng.getSpeed());
    }

    @Test
    public void GearOne() {
        //given That i have a bike on
        Bike Honda = new Bike();
        //when i accelerate it doesn't exceed 20
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();

        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();

        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();

        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();

        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();

        //check that speed is 20
        assertEquals(23, Honda.getSpeed());
    }

    @Test
    public void GearTwo() {
        // Given that i have a bike and it is on
        Bike Honda = new Bike();
        // when i accelerate at gear 2
        Honda.setSpeed(21);
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        //check that speed doesn't exceed 30
        assertEquals(34, Honda.getSpeed());
    }

    @Test
    public void GearThree() {
        // Given that i have a bike and it is on
        Bike Honda = new Bike();
        // when i accelerate at gear 3, speed increases by three
        Honda.setSpeed(31);
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        //check that speed doesn't exceed 40
        assertEquals(47, Honda.getSpeed());
    }

    @Test
    public void GearFourAccelerate() {
        // Given that i have a bike and it is on
        Bike Honda = new Bike();
        // when i accelerate at gear 4, speed increases by 4
        Honda.setSpeed(41);
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        //check that speed doesn't exceed is 52
        assertEquals(53, Honda.getSpeed());
    }


    @Test
    public void BikeCanBeDecelerated() {
        //given That i have a bike on
        Bike Honda = new Bike();
        //when i decelerate
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Accelerate();
        Honda.Brake();
        Honda.Brake();
        //check that speed reduces
        assertEquals(2, Honda.getSpeed());
    }

    @Test
    public void GearTwoDecelerate() {
        //Given theat i have a bike and it is on
        Bike Honda = new Bike();
        //when i decelerate it does by two
        Honda.setSpeed(25);
        Honda.Brake();
        //check that it decelerates by two
        assertEquals(23, Honda.getSpeed());
    }

    @Test
    public void GearThreeDecelerate() {
        //Given theat i have a bike and it is on
        Bike Honda = new Bike();
        //when i decelerate it does by two
        Honda.setSpeed(35);
        Honda.Brake();
        //check that it doesn't fall behind 20
        assertEquals(32, Honda.getSpeed());
    }

    @Test
    public void GearFourDecelerate() {
        //Given theat i have a bike and it is on
        Bike Honda = new Bike();
        //when i decelerate the bike, it decelerates by four speeds
        Honda.setSpeed(45);
        Honda.Brake();
        Honda.Brake();
        Honda.Brake();
        //check that it doesn't fall behind 40
        assertEquals(34, Honda.getSpeed());
    }
}