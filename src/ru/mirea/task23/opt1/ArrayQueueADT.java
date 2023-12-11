package ru.mirea.task23.opt1;

public class ArrayQueueADT {
    private static final int MAX_SIZE = 100; // Максимальный размер очереди
    private Object[] queue = new Object[MAX_SIZE];
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public static void enqueue(ArrayQueueADT queue, Object item) {
        if (queue.size == MAX_SIZE) {
            throw new IllegalStateException("Queue is full");
        }
        queue.queue[queue.tail] = item;
        queue.tail = (queue.tail + 1) % MAX_SIZE;
        queue.size++;
    }

    public static Object element(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.queue[queue.head];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object item = queue.queue[queue.head];
        queue.queue[queue.head] = null;
        queue.head = (queue.head + 1) % MAX_SIZE;
        queue.size--;
        return item;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.queue = new Object[MAX_SIZE];
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }
}
