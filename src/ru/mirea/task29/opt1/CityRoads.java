package ru.mirea.task29.opt1;

import java.util.Scanner;

public class CityRoads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] roads = new int[N][N];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                roads[i][j] = scanner.nextInt();
            }
        }

        int roadsCount = 0;


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (roads[i][j] == 1) {
                    roadsCount++;
                }
            }
        }

        System.out.println(roadsCount);
    }
}
