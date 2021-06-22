package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'u', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}