package edu.penzgtu.oop.task12;

import java.util.HashMap;
import java.util.Map;
import static java.lang.Math.*;

public class Entropy
{
    public static void main(String[] args) {
        String string = "TEST STRING test string";
        Entropy obj = new Entropy();
        double entropy = obj.calculateEntropy(string);
        System.out.printf("String: %s, Entropy: %.2f ", string, entropy);
    }
    double calculateEntropy(String input) {
        Map charFrequency = new HashMap<Character, Integer>();
        for (char c : input.toCharArray()) {
            int value = (int) charFrequency. getOrDefault(c, 0);
            charFrequency. put(c, value+1);
        }

        Map charProbability = new HashMap<Character, Double>();

        for (Object c : charFrequency.keySet()) {
            int value = (int) charFrequency.get(c);
            charProbability.put(c, (double)value/input.length());
        }
        double entropy = 0.D;
        for (Object probability : charProbability.values()) {
            double value = asDouble(probability);
            entropy -= value * (log(value)/log(2));
        }
        return entropy;
    }
    double asDouble(Object o) {
        Double val = null;
        if (o instanceof Number) {
            val = ((Number) o).doubleValue();
        }
        return val;
    }
}
