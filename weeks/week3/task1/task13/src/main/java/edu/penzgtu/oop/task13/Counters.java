package edu.penzgtu.oop.task13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Counters {
    public static void main( String[] args ) {
        String string = "1312@12-3@121@";
        Counters obj = new Counters();
        System.out.println("Counters: " + string + "\n" + obj.parseString(string));
    }

    String parseString(String str) {
        String regexp = "(\\d{3,4}|(\\d{2}-\\d{1}))\\D";
        if (str.length() > 512) {
            System.err.println("Max length input: 512");
            throw new IndexOutOfBoundsException("The string is larger than the allowed range");
        } else if (!matchesAll(str, regexp)) {
            System.err.println("Invalid String");
            throw new PatternSyntaxException(str, regexp, -1);
        }

        String result = "";

        while (!str.isEmpty()) {
            result += str.substring(0, 2) + " ";
            str = str.substring(2);

            if (str.length() > 1 && str.charAt(1) != '@') {
                result += Double.parseDouble(str.substring(0, 2)) + "\n";
                str = str.substring(3);
            } else {
                result += Double.parseDouble(String.valueOf(str.charAt(0))) + "\n";
                str = str.substring(2);
            }
        }
        return result;
    }

    boolean matchesAll(String string, String regexp) {
        Pattern pattern = Pattern.compile(regexp);
        Matcher match = pattern.matcher(string);
        int i = 0;
        int old = 0;
        while (match.find(i) && i < string.length()) {
            i = match.end();
            if (i - old > 5) {
                return false;
            }
            old = i;
        }
        if (i == string.length()) {
            return true;
        }
        return false;
    }
}
