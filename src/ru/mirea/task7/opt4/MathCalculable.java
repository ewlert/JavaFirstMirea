package ru.mirea.task7.opt4;

import java.math.*;

public interface MathCalculable {
    double circumference(double radius);

    double power(double base, double exponent);

    double complexModulus(double real, double imaginary);

    double PI = Math.PI;
}

class MathFunc implements MathCalculable {
    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
}

class Main {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        System.out.println(mathFunc.circumference(3));
        System.out.println(mathFunc.power(12, 3));
        System.out.println(mathFunc.complexModulus(3, 5));
    }
}
