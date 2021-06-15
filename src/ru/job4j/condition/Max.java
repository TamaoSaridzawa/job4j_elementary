package ru.job4j.condition;

public class Max {

        public static int maxNumber(int first, int second) {
            return first > second ? first : second;
        }

    public static void main(String[] args) {
        System.out.println(maxNumber(7, 12));
    }
}
