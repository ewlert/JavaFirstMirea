package ru.mirea.task9.opt1;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Виктор", "Викторов", 123),
                new Student("Сергей", "Сергеев", 337),
                new Student("Александр", "Александров", 228),
                new Student("Степан", "Степанов", 234)
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > current.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private int iDNumber;

    public Student(String firstName, String lastName, int iDNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iDNumber = iDNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + iDNumber + ")";
    }
}
