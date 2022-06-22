package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRatesTest {
    HeartRates heartRates;

    @BeforeEach
    void setUp() {
        heartRates = new HeartRates("David", "Oluyole", 17,
                11, 1990, 15,6, 2022 );
    }
    @Test
    void heartRateCanBeCreated(){
        assertNotNull(heartRates);
    }
    @Test
    void dobCanBeViewed(){
        assertEquals("17:11:1990", heartRates.getDob());
    }
    @Test
    void namesCanBeChanged(){
        heartRates.setFirstName("Olawole");
        heartRates.setLastName("Damilare");
        assertEquals("Olawole", heartRates.getFirstName());
        assertEquals("Damilare", heartRates.getLastName());
    }
    @Test
    void dobCanBeChanged(){
        heartRates.setDayOfBirth(17);
        heartRates.setMonthOfBirth(11);
        heartRates.setYearOfBirth(2002);
        assertEquals(17, heartRates.getDay());
        assertEquals(11, heartRates.getMonth());
        assertEquals(2002, heartRates.getYear());
        assertEquals(19, heartRates.getAge());
    }
    @Test
    void heartRateCanBeCalculated(){
        heartRates.setDayOfBirth(17);
        heartRates.setMonthOfBirth(11);
        heartRates.setYearOfBirth(2001);
        heartRates.getMaximumHeartRate();
        assertEquals(200, heartRates.getMaximumHeartRate());
        heartRates.getTargetHeartRate();
        assertEquals("100 - 170 beats per minute(BPM) ", heartRates.getTargetHeartRate());
    }

}