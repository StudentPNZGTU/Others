package edu.penzgtu.oop.task11;

public class CountsSubstring {

    public static void main( String[] args ) {
        String string = "ImgurImagImperia";
        String substring = "Im";
        CountsSubstring obj = new CountsSubstring();
        System.out.println(string + " " + substring + " " + obj.countSubstring(string, substring));
    }

    int countSubstring(String string, String substring) {
        if (substring.isEmpty()) {
            return 0;
        }
        int oldLength = string.length();
        while (string.contains(substring)) {
            string = string.replace(substring, "");
        }
        return (oldLength-string.length())/substring.length();
    }
}
