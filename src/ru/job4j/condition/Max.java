package ru.job4j.condition;

public class Max {

        public static int maxNumber(int first, int second) {
            int res = first > second ? first : second;
            return res;
        }

    public static void main(String[] args) {
        System.out.println(maxNumber(7, 12));
    }
}
