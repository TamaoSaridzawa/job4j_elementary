package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void momoHorizontalTrue() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'}
        };
        int row = 1;
        boolean res = MatrixCheck.momoHorizontal(input, row);
        Assert.assertTrue(res);
    }

    @Test
    public void momoHorizontalTrue2() {
        char[][] input = {
                {' ', ' ', 'X'},
                {'X', ' ', 'X', 'X'},
                {'X', 'X'}

        };
        int row = 2;
        boolean res = MatrixCheck.momoHorizontal(input, row);
        Assert.assertTrue(res);
    }

    @Test
    public void momoHorizontalFalse() {
        char[][] input = {
                {' ', ' ', 'X'},
                {'X', ' ', 'X'}
        };
        int row = 1;
        boolean res = MatrixCheck.momoHorizontal(input, row);
        Assert.assertFalse(res);
    }

    @Test
    public void monoVerticalTrue() {
        char[][] input = {
                {' ', ' ', 'X', 'X'},
                {'X', ' ', 'X', 'X'},
                {'X', 'X', ' ', 'X'}

        };
        int column = 3;
        boolean res = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(res);
    }

    @Test
    public void monoVerticalFalse() {
        char[][] input = {
                {' ', ' ', 'X', 'X'},
                {'X', ' ', 'X', 'X'},
                {'X', 'X', ' ', 'X'}

        };
        int column = 0;
        boolean res = MatrixCheck.monoVertical(input, column);
        Assert.assertFalse(res);
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertTrue(result);
    }
}