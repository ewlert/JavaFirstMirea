package ru.mirea.task26.opt2;

import java.util.Iterator;
import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private List<T> list;
    private int currentIndex;

    public ListIterator(List<T> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public T next() {
        return list.get(currentIndex++);
    }

    // Пример использования
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        ListIterator<String> iterator = new ListIterator<>(names);

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
