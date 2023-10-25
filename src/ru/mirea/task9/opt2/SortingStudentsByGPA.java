package ru.mirea.task9.opt2;

public class SortingStudentsByGPA {

    public static int compare(Student s1, Student s2) {
        if (s1.getGPA() < s2.getGPA()) {
            return 1;
        } else if (s1.getGPA() > s2.getGPA()) {
            return -1;
        } else {
            return 0;
        }
    }

    private static void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private static int partition(Student[] students, int low, int high) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students[j], pivot) < 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Виктор", "Викторов", 123, 3.7),
                new Student("Сергей", "Сергеев", 337, 3.9),
                new Student("Александр", "Александров", 228, 3.5),
                new Student("Степан", "Степанов", 234, 4.0)
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        quickSort(students, 0, students.length - 1);

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private int iDNumber;
    private double GPA;

    public Student(String firstName, String lastName, int iDNumber, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
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

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + iDNumber + ") - GPA: " + GPA;
    }
}