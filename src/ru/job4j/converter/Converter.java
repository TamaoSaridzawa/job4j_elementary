package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        float expected2 = 2.3333333f;
        int out = Converter.rubleToEuro(in);
        float out2 = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are 2. Test result : " + passed2);
    }
}
