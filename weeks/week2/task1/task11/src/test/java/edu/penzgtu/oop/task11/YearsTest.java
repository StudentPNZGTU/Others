package edu.penzgtu.oop.task11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearsTest
{
    @Test
    public void yearsTesting() {
        Years obj = new Years();
        assertEquals(obj.getYears(0), "лет");
        assertEquals(obj.getYears(21), "год");
        assertEquals(obj.getYears(27), "лет");

        for (int i = 1; i < 4; i++) {
            assertEquals(obj.getYears(i), "года");
        }
    }
}
