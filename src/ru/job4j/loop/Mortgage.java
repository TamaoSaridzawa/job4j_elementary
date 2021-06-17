package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        boolean debt = true;
        while (debt) {
            amount += (amount * (percent / 100));
              if (amount > salary) {
                amount -= salary;
                year++;
            } else {
                debt = false;
            }
        }
        return year;
    }
}
