package ru.mirea.task25.opt3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
    private static final String DATE_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$";

    public static boolean isValidDate(String dateStr) {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(dateStr);

        if (matcher.matches()) {
            int year = Integer.parseInt(matcher.group(3));
            return year >= 1900 && year <= 9999;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String date1 = "31/12/2020";
        String date2 = "29/02/2021";
        String date3 = "01/01/1899";
        String date4 = "01/01/10000";

        System.out.println(isValidDate(date1));
        System.out.println(isValidDate(date2));
        System.out.println(isValidDate(date3));
        System.out.println(isValidDate(date4));
    }
}
