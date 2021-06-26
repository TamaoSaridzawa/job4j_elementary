package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int change = money - price;
        int point = 0;
        for (int number : coins) {
            while (change - number >= 0) {
                rsl[point] = number;
                change -= number;
                point++;
            }
        }
        return Arrays.copyOf(rsl, point);
    }
}
