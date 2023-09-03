package ru.mirea.task1.opt3;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 4;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Сумма массива %d \nСреднее арифметическое %d ", sum, sum / arr.length);
    }
}