package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                rsl = 1;
            } else {
                rsl *= i;
            }
        }
        return rsl;
    }
}
