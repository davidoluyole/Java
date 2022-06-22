package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    Clock clock;

    @BeforeEach
    void setUp(){
        clock = new Clock(12, 12, 12);
    }
    @Test
    void clockCanBeSetTest() {
        assertEquals(12, clock.getHour());
        assertEquals(12, clock.getMinute());
        assertEquals(12, clock.getSecond());
    }
    @Test
    void clockHourCanBeSetTest() {
            clock.setHour(25);
            assertEquals(0, clock.getHour());
        }
    @Test
    void clockMinuteCanBeSetTest() {
        clock.setMinute(72);
        assertEquals(0, clock.getMinute());
        }
    @Test
    void clockSecondCanBeSetTest() {
        clock.setSecond(72);
        assertEquals(0, clock.getSecond());
        }
    @Test
    void timeCanBeDisplayed(){
        assertEquals("12:12:12", clock.displayTime());
    }
}
