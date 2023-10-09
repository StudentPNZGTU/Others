package edu.penzgtu.oop.task21;

public class Email {
    public static void main( String[] args ){
        String email = "greumaffe133@gmail.com";
        System.out.printf("email: %s\nbool: %s", email, isValidEmail(email));
    }
    static boolean isValidEmail(String email) {
        return email.matches("[\\w\\d]{6,30}@\\w{2,63}\\.\\w{2,3}");
    }
}
