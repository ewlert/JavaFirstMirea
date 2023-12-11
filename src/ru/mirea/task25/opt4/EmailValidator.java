package ru.mirea.task25.opt4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@[A-Za-z0-9]+([.-][A-Za-z0-9]+)*\\.[A-Za-z]{2,}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String email1 = "user@example.com";
        String email2 = "root@localhost";
        String email3 = "myhost@@@com.ru";
        String email4 = "@my.ru";
        String email5 = "Julia String";

        System.out.println(isValidEmail(email1));
        System.out.println(isValidEmail(email2));
        System.out.println(isValidEmail(email3));
        System.out.println(isValidEmail(email4));
        System.out.println(isValidEmail(email5));
    }
}

