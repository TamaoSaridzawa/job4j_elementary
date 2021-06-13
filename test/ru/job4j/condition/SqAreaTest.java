package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2SquareThen() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1SquareThen() {
        int p = 4;
        double k = 1;
        int expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K25SquareThen() {
        int p = 6;
        double k = 2.5;
        double expected = 1.83;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}