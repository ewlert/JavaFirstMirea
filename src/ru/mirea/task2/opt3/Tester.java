package ru.mirea.task2.opt3;

public class Tester {
    private Circle[] circles;
    private int size;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        size = 0;
    }

    public void addCircle(Circle circle) {
        circles[size] = circle;
        size++;
    }

    public int getSize() {
        return size;
    }
}
