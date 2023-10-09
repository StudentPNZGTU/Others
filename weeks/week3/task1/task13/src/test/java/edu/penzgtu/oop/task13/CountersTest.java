package edu.penzgtu.oop.task13;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.PatternSyntaxException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountersTest {

    Counters obj = new Counters();
    @Test
    public void validCountersTest() {
        String valid =  "63 -4.0\n" +
                        "46 1.0\n" +
                        "12 7.0\n" +
                        "37 44.0\n" +
                        "66 46.0\n";
        Assertions.assertEquals(valid, obj.parseString("3744@6646@63-4@461@127@", 1));

        valid = "12 7.0\n" +
                "37 44.0\n" +
                "46 1.0\n" +
                "63 -4.0\n" +
                "66 46.0\n";

        Assertions.assertEquals(valid, obj.parseString("3744@6646@63-4@461@127@", 0));
    }

    @Test
    public void invalidStringTest() {
        String invalid = "1312@123-3@12";
        PatternSyntaxException thrown = assertThrows(
                PatternSyntaxException.class,
                () -> obj.parseString(invalid, 0),
                ""
        );
        assertTrue(thrown.getMessage().contains (
                "1312@123-3@12\n((\\d{2}-?(([0-4]?\\d)|-?50|))@){1,128}")
        );
    }

    @Test
    public void lengthOutTest() {
        StringBuilder invalid = new StringBuilder();
        while (invalid.length() < 644) {
            invalid.append("1234@");
        }
        IndexOutOfBoundsException thrown = assertThrows(
                IndexOutOfBoundsException.class,
                () -> obj.parseString(invalid.toString(), 0),
                ""
        );
        assertTrue(thrown.getMessage().contains (
                "Entering a string greater than the allowed value")
        );
    }
}
