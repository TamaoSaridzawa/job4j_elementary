package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean res = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(res);
    }

    @Test
    public void whenExistNo() {
        double ab = 2;
        double ac = 6;
        double bc = 2;
        boolean res = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(res);
    }
}