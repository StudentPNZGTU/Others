package edu.penzgtu.oop.task13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Counters {

    public static void main( String[] args ) {
        String string = "3744@6646@63-4@461@127@";
        Counters obj = new Counters();
        System.out.println("Counters: " + string + "\n" + obj.parseString(string, 0));
    }

    String parseString(String str, int value) {
        String regexp = "((\\d{3,4}|\\d{2}-\\d{1})\\D){1,100}";
        if (!matchesAll(str, regexp)) {
            if (str.length() > 512) {
                System.err.println("Max length input: 512");
                throw new IndexOutOfBoundsException("The string is larger than the allowed range");
            }
            System.err.println("Invalid String");
            throw new PatternSyntaxException(str, regexp, -1);
        }
        int length = str.replaceAll("[\\w\\d-]{1,100}", "").length();
        int[] id;
        id = new int[length];

        double[] temperature;
        temperature = new double[length];

        int i = 0;
        while (!str.isEmpty()) {
            id[i] = Integer.parseInt(str.substring(0, 2));
            str = str.substring(2);

            if (str.length() > 1 && str.charAt(1) != '@') {
                temperature[i] = Double.parseDouble(str.substring(0, 2));
                str = str.substring(3);
            } else {
                temperature[i] = Double.parseDouble(String.valueOf(str.charAt(0)));
                str = str.substring(2);
            }
            i++;
        }
        return sortIdCounters(temperature, id, value);
    }

    String sortIdCounters(double[] temp, int[] id, int value) {
        String result = "";
        if (value > 0 || value < 0) {
            Map map = new HashMap<Double, Integer>();

            for (int i = 0; i < temp.length; i++) {
                map.put(temp[i], i);
            }
            Arrays.sort(temp);

            for (double key : temp) {
                result += id[(int) map.get(key)] + " " + (key) + "\n";
            }
            return result;
        }

        Map map = new HashMap<Integer, Double>();

        for (int i = 0; i < id.length; i++) {
            map.put(id[i], i);
        }
        Arrays.sort(id);

        for (Integer key : id) {
            result += (key) + " " + temp[(int) map.get(key)] + "\n";
        }
        return result;
    }
    boolean matchesAll(String string, String regexp) {
        Pattern pattern = Pattern.compile(regexp);
        Matcher match = pattern.matcher(string);
        return match.matches();
    }
}
