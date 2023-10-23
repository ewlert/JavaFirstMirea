package ru.mirea.task2.opt8;

public class ReverseArray {
    public static void main(String[] args) {
        String[] arr = {"First", "Second", "Third", "Fourth", "Fifth"};
        for (int i = 0; i < arr.length / 2; i++) {
            String te = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = te;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
