package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TortoiseAndHareTest {
    @Test
    public void raceCanBeCreated(){
        TortoiseAndHareRace tortoiseAndHareRace = new TortoiseAndHareRace();
        tortoiseAndHareRace.getTortoise();
        tortoiseAndHareRace.setTortoise(20);
        assertEquals(20,tortoiseAndHareRace.getTortoise());

    }
}
