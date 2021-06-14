package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот";
        String expected = "Привет, умник";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Сколько будет 2 + 2?";
        String result = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, result);
    }
}