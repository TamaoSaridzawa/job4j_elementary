package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to5() {
        int[] input = {1, 2, 3, 4, 7, 5, 8};
        int source = 3;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 5, 7, 4, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5to2() {
        int[] input = {1, 2, 3, 4, 13, 7, 9};
        int source = 5;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 7, 4, 13, 3, 9};
        Assert.assertArrayEquals(expected, result);
    }
}