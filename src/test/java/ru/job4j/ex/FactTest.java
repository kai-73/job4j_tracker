package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void nCouldNotBeLessThen0() {
        Fact.calc(-1);
    }
}