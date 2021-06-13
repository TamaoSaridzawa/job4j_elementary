package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void thenDisA3B5C7D12When8() {
        int a = 3;
        int b = 5;
        int c = 7;
        int d = 12;
        double expected = 8.06;
        double out = Point.distance(a, b, c, d);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void thenDisA6B2C1D17When15() {
        int a = 6;
        int b = 2;
        int c = 1;
        int d = 17;
        double expected = 15.81;
        double out = Point.distance(a, b, c, d);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void thenDisA1B4C8D9When8() {
        int a = 1;
        int b = 4;
        int c = 8;
        int d = 9;
        double expected = 8.60;
        double out = Point.distance(a, b, c, d);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void thenDisA1B1C1D27When1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 2;
        double expected = 1.0;
        double out = Point.distance(a, b, c, d);
        Assert.assertEquals(expected, out, 0.01);
    }
}