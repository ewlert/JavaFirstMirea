package ru.mirea.task3.opt4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        ArrayList art = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(n);
            if(arr[i] % 2 == 0){
                art.add(arr[i]);

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(art);
    }
}