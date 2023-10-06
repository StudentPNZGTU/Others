package edu.penzgtu.oop.task21;

public class Email {
    public static void main( String[] args ){
        String email = "greumaffe133@gmail.com";
        Email obj = new Email();
        System.out.println(email + " " + obj.validEmail(email));
    }
    boolean validEmail(String email) {
        return email.matches("[\\w\\d]{6,30}@\\w{2,63}\\.\\w{2,3}");
    }
}
