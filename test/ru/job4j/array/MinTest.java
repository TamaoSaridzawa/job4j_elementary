package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void findMin1() {
        int[] array = new int[] {2, 5, 3, 6, 1, 8};
        int expected = 1;
        int result = Min.findMin(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void findMin0() {
        int[] array = new int[] {2, 5, 3, 4, 1, 0};
        int expected = 0;
        int result = Min.findMin(array);
        Assert.assertEquals(expected, result);
    }
}