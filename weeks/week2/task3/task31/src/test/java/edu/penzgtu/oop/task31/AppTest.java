package edu.penzgtu.oop.task31;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
    CountMaxNums obj = new CountMaxNums();

    @Test
    public void test() {
        double[] arr;

        arr = new double[]{};
        assertEquals(obj.countMax(arr), 0);

        arr = new double[] {1, 1, 2, 3, 4, 5};
        assertEquals(obj.countMax(arr), 1);

        arr = new double[] {1, 2, 3, 4, 5, 5, 5};
        assertEquals(obj.countMax(arr), 3);

        arr = new double[] {1, 2, 3, 3, 3, 3, 4, 5};
        assertEquals(obj.countMax(arr), 1);

        arr = new double[] {1, 2, 3, 3, 3, 3, 4, 5};
        assertEquals(obj.countMax(arr), 1);
    }
}
