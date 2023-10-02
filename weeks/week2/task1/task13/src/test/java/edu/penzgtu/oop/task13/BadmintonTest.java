package edu.penzgtu.oop.task13;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class BadmintonTest {
    Badminton testing = new Badminton();
    Map<String, String> dct = new HashMap<>();

    @Test
    public void testGoBadminton() {
        dct.put("day", "sunday");
        dct.put("temperature", "warm");
        dct.put("precipitation", "clear");
        dct.put("wind", "false");
        dct.put("humidity", "low");
        assertEquals(testing.goPlayBadminton(dct), true);
        dct.put("precipitation", "cloudy");
        assertEquals(testing.goPlayBadminton(dct), true);
        dct.put("humidity", "hight");
        assertEquals(testing.goPlayBadminton(dct), true);
    }

    @Test
    public void testAtHome() {
        dct.put("day", "monday");
        dct.put("temperature", "warm");
        dct.put("precipitation", "clear");
        dct.put("wind", "false");
        dct.put("humidity", "low");
        assertEquals(testing.goPlayBadminton(dct), false);
        dct.put("day", "sunday");
        dct.put("wind", "true");
        assertEquals(testing.goPlayBadminton(dct), false);
    }

    @Test
    void testDictionaryInputError() {
        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> testing.goPlayBadminton(dct),
                "Wrong key"
        );
        assertTrue(thrown.getMessage().contains (
                "Cannot invoke \"java.lang.CharSequence.toString()\" because \"s\" is null")
        );
    }
}
