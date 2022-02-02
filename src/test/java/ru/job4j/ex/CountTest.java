package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Count.add(10, 2);
    }

    @Test
    public void when0To2Then3() {
        assertEquals(3, Count.add(0, 3));
    }

}