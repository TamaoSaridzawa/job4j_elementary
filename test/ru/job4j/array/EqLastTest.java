package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = new int[] {2, 6, 8};
        int[] right = new int[] {8, 5, 8};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = new int[] {2, 6, 8};
        int[] right = new int[] {2, 5, 7};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }

    @Test
    public void whenEq2() {
        int[] left = new int[] {2, 6, 8};
        int[] right = new int[] {2, 5, 7, 8};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

}