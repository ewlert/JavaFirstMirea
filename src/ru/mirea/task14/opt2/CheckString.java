package ru.mirea.task14.opt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);

        String str1 = "abcdefghijklmnopqrstuv18340";
        Matcher matcher1 = pattern.matcher(str1);
        System.out.println(str1 + " идентичен строке: " + matcher1.matches());

        String str2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        Matcher matcher2 = pattern.matcher(str2);
        System.out.println(str2 + " идентичен строке: " + matcher2.matches());
    }
}