package ru.job4j.condition;

public class Max {

        public static int maxNumber(int first, int second) {
            return first > second ? first : second;
        }

        public static int maxNumberThree(int first, int second, int three) {
            return maxNumber(first, maxNumber(second, three));
        }

        public static int maxNumberFor(int first, int second, int three, int four) {
            return maxNumber(maxNumber(first, second), maxNumber(three, four));
        }

}
