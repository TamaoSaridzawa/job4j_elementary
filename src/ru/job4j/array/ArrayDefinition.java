package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Katya";
        names[1] = "Alex";
        names[2] = "Den";
        names[3] = "Gena";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
