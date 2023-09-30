package edu.penzgtu.oop.task13;

import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main( String[] args ) {
        App print = new App();
        Map<String, String> dct = new HashMap<>();

        dct.put("day", "sunday");
        dct.put("temperature", "warm");
        dct.put("precipitation", "cloudy");
        dct.put("wind", "false");
        dct.put("humidity", "low");

        print.goPlayBadminton(dct);
    }

    void goPlayBadminton(Map<String, String> dct) {

        for (Map.Entry<String, String> e : dct.entrySet()) {
            /*
        Play badminton
        day: sunday
        temperature: warm
        precipitation: cloudy, clear
        wind: true
        humidity: low
     */
            String valid = "sundaywarmcloudyfalsecloudylowclear";
            if (!valid.contains(e.getValue())) {
                System.out.println("Сидите дома");
                return;
            }
        }
        System.out.println("Не хотите поиграть в бадминтон? - Отличная погода!");
    }
}
