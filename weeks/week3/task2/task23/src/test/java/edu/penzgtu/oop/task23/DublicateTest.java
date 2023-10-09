package edu.penzgtu.oop.task23;

import static edu.penzgtu.oop.task23.Dublicates.removeDublicates;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DublicateTest
{
    @Test
    public void validDublicatesTest() {
            String input = "A Ghettooo Chhhrissstmas Carrrol";
        assertEquals(removeDublicates(input), "A Ghetto Christmas Carol");
        input = "Hellooo UUUssseeerrr";
        assertEquals(removeDublicates(input), "Hello User");
    }
}
