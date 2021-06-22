package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'h', 'e', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenStartWithPrefixThenFalse() {
        char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'h', 'i', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(result);
    }
}