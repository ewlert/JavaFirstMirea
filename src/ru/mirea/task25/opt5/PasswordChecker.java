package ru.mirea.task25.opt5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";

    public static boolean isPasswordValid(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String password1 = "Password123";
        String password2 = "abc123";
        String password3 = "PASSWORD123";
        String password4 = "Password";

        System.out.println(isPasswordValid(password1));
        System.out.println(isPasswordValid(password2));
        System.out.println(isPasswordValid(password3));
        System.out.println(isPasswordValid(password4));
    }
}
