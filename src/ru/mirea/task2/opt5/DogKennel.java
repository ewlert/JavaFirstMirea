package ru.mirea.task2.opt5;

public class DogKennel {
    private Dog[] dogs;
    private int size;

    public DogKennel(int capacity) {
        dogs = new Dog[capacity];
        size = 0;
    }

    public void addDog(Dog dog) {
        if (size < dogs.length) {
            dogs[size] = dog;
            size++;
        } else {
            System.out.println("Питомник полон!");
        }
    }

    public void printDogs() {
        for (int i = 0; i < size; i++) {
            System.out.println(dogs[i]);
        }
    }
}
