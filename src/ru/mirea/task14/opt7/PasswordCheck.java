package ru.mirea.task14.opt7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {
    public static void main(String[] args) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        Pattern pattern = Pattern.compile(regex);

        String password1 = "Abcdefg1_";
        Matcher matcher1 = pattern.matcher(password1);
        System.out.println(password1 + " безопасный пароль: " + matcher1.matches());

        String password2 = "weakpassword";
        Matcher matcher2 = pattern.matcher(password2);
        System.out.println(password2 + " безопасный пароль: " + matcher2.matches());
    }
}
