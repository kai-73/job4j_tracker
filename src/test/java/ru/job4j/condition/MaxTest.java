package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static ru.job4j.condition.Max.*;

public class MaxTest {

    @Test
    public void whenMax2() {
        int result = max(1, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
        }

    @Test
    public void whenMax() {
        int result = max(5, 2, 7);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testTestMax1() {
        int result = max(12, 2, 25, 7);
        int expected = 25;
        Assert.assertEquals(result, expected);
    }
}