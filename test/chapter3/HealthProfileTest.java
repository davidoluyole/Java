package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HealthProfileTest {
    HealthProfile healthProfile;
    @BeforeEach
    void SetUp(){
        healthProfile = new HealthProfile("David", "Oluyole",
                "Male", 17,11, 1990, 75,
                188, 15, 6, 2022 );
    }
    @Test
    void heartRateCanBeCreated(){
        assertNotNull(healthProfile);
    }
    @Test
    void dobCanBeViewed(){
        assertEquals("17:11:1990", healthProfile.getDob());
    }
    @Test
    void namesCanBeChanged(){
        healthProfile.setFirstName("Olawole");
        healthProfile.setLastName("Damilare");
        assertEquals("Olawole", healthProfile.getFirstName());
        assertEquals("Damilare", healthProfile.getLastName());
    }
    @Test
    void dobCanBeChanged(){
        healthProfile.setDayOfBirth(17);
        healthProfile.setMonthOfBirth(11);
        healthProfile.setYearOfBirth(2002);
        assertEquals(17, healthProfile.getBirthDay());
        assertEquals(11, healthProfile.getBirthMonth());
        assertEquals(2002, healthProfile.getBirthYear());
        assertEquals(19, healthProfile.getAge());
    }
    @Test
    void heartRateCanBeCalculated(){
        healthProfile.setDayOfBirth(17);
        healthProfile.setMonthOfBirth(11);
        healthProfile.setYearOfBirth(2001);
        healthProfile.getMaximumHeartRate();
        assertEquals(200, healthProfile.getMaximumHeartRate());
        healthProfile.getTargetHeartRate();
        assertEquals("100 - 170 beats per minute(BPM) ", healthProfile.getTargetHeartRate());
    }
    @Test
    void BMICanBeCalculated(){
        assertEquals(23.498147728384346, healthProfile.getBMI());
    }
}
