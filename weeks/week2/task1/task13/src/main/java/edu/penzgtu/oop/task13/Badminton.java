package edu.penzgtu.oop.task13;

import java.util.HashMap;
import java.util.Map;

/*
        Play badminton

        day: sunday
        temperature: warm
        precipitation: cloudy, clear
        wind: true
        humidity: low
     */

public class Badminton
{
    public static void main( String[] args ) {
        Badminton obj = new Badminton();
        Map<String, String> dct = new HashMap<>();

        dct.put("days", "sunday");
        dct.put("temperature", "warm");
        dct.put("precipitation", "clear");
        dct.put("wind", "false");
        dct.put("humidity", "low");

        if (obj.goPlayBadminton(dct)) {
            System.out.println("Самое время поиграть в бадминтон");
        } else {
            System.out.println("Сидите дома");
        }

    }

    boolean goPlayBadminton(Map<String, String> dct) {
        String valid = "sundaywarmcloudyfalsecloudylowhightclear";
        String[] keys = {"day", "temperature", "precipitation", "wind", "humidity"};

        for (int i = 0; i < keys.length; i++) {
            if (dct.get(keys[i]) == null) {
                System.err.println("Invalid Map<String><String> (the key does not exist)");
                try {
                    dct.containsKey(keys[i]);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            if (!valid.contains(dct.get(keys[i]))) {
                return false;
            }
        }
        return true;
    }
}
