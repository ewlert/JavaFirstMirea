package ru.mirea.task1.opt4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, k = 0, sum = 0;
        int min = 99, max = 0;
        int[] arr = new int[5];
        while (k < arr.length) {
            j = sc.nextInt();
            arr[k] = j;
            sum += arr[k];
            min = Math.min(min, arr[k]);
            max = Math.max(max, arr[k]);
            k += 1;
        }
        System.out.println("Сумма массива " + sum);
        System.out.printf("Минимальное число %d \nМаксимальное число %d", min, max);
    }
}
