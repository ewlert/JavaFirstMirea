package ru.mirea.task2.opt5;

public class Tester {
    public static void main(String[] args) {
        DogKennel kennel = new DogKennel(3);

        kennel.addDog(new Dog("Rex", 2));
        kennel.addDog(new Dog("Buddy", 4));
        kennel.addDog(new Dog("Max", 6)); // не добавится, так как питомник уже полный

        kennel.printDogs();
    }
}
