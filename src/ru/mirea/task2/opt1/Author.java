package ru.mirea.task2.opt1;

import java.lang.String;

public class Author {
    public String name;
    public String email;
    public char gender;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Author(String name, String email, char gender) {

        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
