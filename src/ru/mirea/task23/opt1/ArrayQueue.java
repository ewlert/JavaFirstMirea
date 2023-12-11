package ru.mirea.task23.opt1;

public class ArrayQueue {
    private static final int MAX_SIZE = 100; // Максимальный размер очереди
    private Object[] queue = new Object[MAX_SIZE];
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public void enqueue(Object item) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Queue is full");
        }
        queue[tail] = item;
        tail = (tail + 1) % MAX_SIZE;
        size++;
    }

    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }

    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object item = queue[head];
        queue[head] = null;
        head = (head + 1) % MAX_SIZE;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        queue = new Object[MAX_SIZE];
        size = 0;
        head = 0;
        tail = 0;
    }
}

