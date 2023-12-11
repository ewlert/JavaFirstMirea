package ru.mirea.task23.opt1;

import ru.mirea.task23.opt1.ArrayQueueADT;
import ru.mirea.task23.opt1.ArrayQueueModule;

public class Test {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(10);
        ArrayQueueModule.enqueue(20);
        ArrayQueueModule.enqueue(30);

        System.out.println(ArrayQueueModule.size()); // 3
        System.out.println(ArrayQueueModule.element()); // 10

        Object item = ArrayQueueModule.dequeue();
        System.out.println(item); // 10

        System.out.println(ArrayQueueModule.size()); // 2

        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // true

        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queue, 10);
        ArrayQueueADT.enqueue(queue, 20);
        ArrayQueueADT.enqueue(queue, 30);

        System.out.println(ArrayQueueADT.size(queue)); // 3
        System.out.println(ArrayQueueADT.element(queue)); // 10

    }
}
