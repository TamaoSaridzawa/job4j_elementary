package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        while (true) {
            amount += (amount * (percent / 100));
            if (salary > amount) {
                break;
            }
                amount -= salary;
                year++;
        }
        return year;
    }
}
