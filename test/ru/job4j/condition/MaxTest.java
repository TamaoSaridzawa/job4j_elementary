package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then6() {
        int first = 6;
        int second = 4;
        int expected = 6;
        int out = Max.maxNumber(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax2To1Then7() {
        int first = 4;
        int second = 7;
        int expected = 7;
        int out = Max.maxNumber(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenEqual1To2Then4() {
        int first = 4;
        int second = 4;
        int expected = 4;
        int out = Max.maxNumber(first, second);
        Assert.assertEquals(expected, out);
    }
}