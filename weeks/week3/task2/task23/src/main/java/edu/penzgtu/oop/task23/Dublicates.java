package edu.penzgtu.oop.task23;

public class Dublicates {
    public static void main( String[] args ) {
        String invalid = "Hellooo UUUssseeerrr";
        Dublicates obj = new Dublicates();
        System.out.println(invalid + " -> " + obj.removeDublicates(invalid));
    }

    String removeDublicates(String string) {
        string = string.replaceAll("(.)\\1{2,}", "$1");
        return string;
    }
}
