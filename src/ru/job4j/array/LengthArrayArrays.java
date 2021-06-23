package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3}, {1, 5, 7}, {2, 6, 9, 8}};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
        }
    }
}
