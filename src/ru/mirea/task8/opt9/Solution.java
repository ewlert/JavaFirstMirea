package ru.mirea.task8.opt9;

public class Solution {
    public static int sol(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return sol(a, b - 1) + sol(a - 1, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(sol(1, 1));
    }
}
