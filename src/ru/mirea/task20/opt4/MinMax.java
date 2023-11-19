package ru.mirea.task20.opt4;

class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T getMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}

class Calculator {
    public static <T, V> T sum(T a, V b) {
        return a;
    }

    public static <T, V> T multiply(T a, V b) {
        return a;
    }

    public static <T, V> T divide(T a, V b) {
        return a;
    }

    public static <T, V> T subtraction(T a, V b) {
        return a;
    }

    public static void main(String[] args) {
        Integer[] numbers = {4, 2, 6, 8, 1};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Min: " + minMax.getMin());
        System.out.println("Max: " + minMax.getMax());
        Integer a = 5;
        Double b = 2.5;
        Integer sumResult = Calculator.sum(a, b.intValue());
        System.out.println("Sum: " + sumResult);
        Double multiplyResult = Calculator.multiply(a.doubleValue(), b);
        System.out.println("Multiply: " + multiplyResult);
        Double divideResult = Calculator.divide(a.doubleValue(), b);
        System.out.println("Divide: " + divideResult);
        Integer subtractionResult = Calculator.subtraction(a, b.intValue());
        System.out.println("Subtraction: " + subtractionResult);
    }
}