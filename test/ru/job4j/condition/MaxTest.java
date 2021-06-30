package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
// Правильное название задачи

public class MaxTest {

    @Test
    public void whenMaxThen9() {
        int first = 6;
        int second = 4;
        int three = 9;
        int four = 1;
        int expected = 9;
        int out = Max.maxNumberFor(first, second, three, four);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMaxThen10() {
        int first = 10;
        int second = 4;
        int three = 3;
        int expected = 10;
        int out = Max.maxNumberThree(first, second, three);
        Assert.assertEquals(expected, out);
    }

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