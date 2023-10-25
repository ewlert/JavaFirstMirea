package ru.mirea.task11.opt2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Comparison {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате дд.мм.гггг");
        String inputDate = scanner.nextLine();
        Date inputDateFormatted = new SimpleDateFormat("dd.MM.yyyy").parse(inputDate);
        Date current = new Date();
        if (inputDateFormatted.before(current)){
            System.out.println("Текущая дата позже введенной");
        }
        if (inputDateFormatted.after(current)){
            System.out.println("Текущая дата раньше введенной");
        }
        else System.out.println("Текущая дата совпадает с введенной");
    }
}