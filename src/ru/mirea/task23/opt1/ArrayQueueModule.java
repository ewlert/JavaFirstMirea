package ru.mirea.task23.opt1;

public class ArrayQueueModule {
    private static final int MAX_SIZE = 100; // Максимальный размер очереди
    private static Object[] queue = new Object[MAX_SIZE];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    public static void enqueue(Object item) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Queue is full");
        }
        queue[tail] = item;
        tail = (tail + 1) % MAX_SIZE;
        size++;
    }

    public static Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }

    public static Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object item = queue[head];
        queue[head] = null;
        head = (head + 1) % MAX_SIZE;
        size--;
        return item;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        queue = new Object[MAX_SIZE];
        size = 0;
        head = 0;
        tail = 0;
    }
}
