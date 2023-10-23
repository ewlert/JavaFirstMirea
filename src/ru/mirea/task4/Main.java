package ru.mirea.task4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red",true,34);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimetr());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle("blue",false,21,15);
        System.out.println(" ");
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.toString());

        Square square = new Square("green",true,12,12,3);
        System.out.println(" ");
        System.out.println(square.getPerimetr());
        System.out.println(square.getArea());
        System.out.println(square.toString());
    }
}
