package ru.mirea.task20.opt3;

import java.io.Serializable;

class Animal implements Serializable {    // Код класса Animal
}

class GenericClass<T extends Comparable<? super T>, V extends Animal & Serializable, K> {
    private T variable1;
    private V variable2;
    private K variable3;

    public GenericClass(T variable1, V variable2, K variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public T getVariable1() {
        return variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public K getVariable3() {
        return variable3;
    }

    public void printClassNames() {
        System.out.println("Variable 1 class name: " + variable1.getClass().getName());
        System.out.println("Variable 2 class name: " + variable2.getClass().getName());
        System.out.println("Variable 3 class name: " + variable3.getClass().getName());
    }
}

class Main {
    public static void main(String[] args) {
        Integer variable1 = 10;
        String variable2 = "Hello";
        Double variable3 = 3.14;
        GenericClass<Integer, Animal, Double> myClass = new GenericClass<>(variable1, new Animal(), variable3);
        myClass.printClassNames();
    }
}