package edu.penzgtu.oop.task11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountsSubstringTest {

    CountsSubstring obj = new CountsSubstring();
    @Test
    public void nullSubstringTest() {
        assertEquals(obj.countSubstring("value", ""), 0);
        assertEquals(obj.countSubstring("", "value"), 0);
    }
    @Test
    public void SubstringTest() {
        assertEquals(obj.countSubstring("StringString", "Str"), 2);
        assertEquals(obj.countSubstring("obj", "obj"), 1);
        assertEquals(obj.countSubstring("11111", "1"), 5);
    }
}
