package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenMin0() {
        int[] array = new int[] {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int expected = 0;
        int result = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMin1() {
        int[] array = new int[] {-1, 2, 5, 1};
        int start = 1;
        int finish = 3;
        int expected = 1;
        int result = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMin2() {
        int[] array = new int[] {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

}