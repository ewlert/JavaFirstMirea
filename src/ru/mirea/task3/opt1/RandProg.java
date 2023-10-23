package ru.mirea.task3.opt1;

import java.util.Arrays;
import java.util.Random;

class RandProg {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        double[] art = new double[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(1000);
            art[i] = Math.random();
        }

        System.out.println("Первый массив " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный первый массив " + Arrays.toString(arr));
        System.out.println("Второй массив " + Arrays.toString(art));
        Arrays.sort(art);
        System.out.println("Отсортированный второй массив " + Arrays.toString(art));
    }
}