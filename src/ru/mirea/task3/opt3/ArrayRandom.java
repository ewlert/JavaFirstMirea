package ru.mirea.task3.opt3;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random random = new Random();

        // заполнение массива случайными числами от 10 до 99
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(90) + 10;
        }

        // вывод массива на экран
        System.out.println(Arrays.toString(arr));

        // проверка на строго возрастающую последовательность
        boolean isStrictlyIncreasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }

        // вывод сообщения о результате проверки
        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
