package edu.penzgtu.oop.task12;
import static edu.penzgtu.oop.task12.Entropy.calculateEntropy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EntropyTest
{
    @Test
    public void EntropyTest() {
        String string = "TEST STRING test string";
        assertEquals(calculateEntropy(string.toCharArray()), "3,73");
    }
}
