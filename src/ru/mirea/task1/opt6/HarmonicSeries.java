package ru.mirea.task1.opt6;

public class HarmonicSeries {
    public static void main(String[] args) {
        int num = 1;
        double result = 0.0;
        System.out.println("Гармонический ряд ");
        while (num < 11) {
            result = result + (double) 1 / num;
            num++;
            System.out.format("\n%.3f ", result);
        }
    }
}
