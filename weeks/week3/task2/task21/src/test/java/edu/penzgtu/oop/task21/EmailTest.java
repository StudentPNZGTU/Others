package edu.penzgtu.oop.task21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static edu.penzgtu.oop.task21.Email.isValidEmail;

public class EmailTest {

    @Test
    public void validEmail() {
        String[] strings;
        strings = new String[] {
                "peulatruveya1555@list.ru",
                "brafacrogohu9624@gmail.com",
                "greumaffeipracrau2616@mail.com",
                "setroikifemm6870@email.com"
        };
        for (String email: strings) {
            Assertions.assertEquals(isValidEmail(email), true);
        }
    }
    @Test
    public void invalidEmail() {
        String[] strings;
        strings = new String[] {
                "$peulatruveya1555@list.ru",
                "Abrafacrogohu9624g.com",
                "greumaffeipracrau@.com",
                "setroikifemm6870@email.c"
        };
        for (String email: strings) {
            Assertions.assertEquals(isValidEmail(email), false);
        }
    }
}
