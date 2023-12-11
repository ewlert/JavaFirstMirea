package ru.mirea.task26.opt1;

import java.util.Stack;

public class ArrayInverter {
    public static void invertArray(Integer[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        invertArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // Вывод: 5 4 3 2 1
    }
}
