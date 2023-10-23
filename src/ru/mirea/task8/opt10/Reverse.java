package ru.mirea.task8.opt10;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }
}
