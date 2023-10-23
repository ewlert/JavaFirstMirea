package ru.mirea.task2.opt6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of circle 1: ");
        double radius1 = scanner.nextDouble();

        System.out.print("Enter the radius of circle 2: ");
        double radius2 = scanner.nextDouble();

        Circle circle1 = new Circle(radius1);
        Circle circle2 = new Circle(radius2);

        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());

        System.out.println("Circle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Circumference: " + circle2.getCircumference());

        if (circle1.equals(circle2)) {
            System.out.println("Circle 1 and Circle 2 have the same radius.");
        } else {
            System.out.println("Circle 1 and Circle 2 have different radii.");
        }
    }
}
