package ru.job4j.pojo;

import org.junit.Assert;
import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqCode() {
        License first = new License("audi");
        /* first.setCode("audi"); */
        License second = new License();
        second.setCode("audi");
        Assert.assertEquals(first, second);
    }

    @Test
    public void eqOwner() {
        License first = new License();
        first.setOwner("Romanov Oleg");
        License second = new License();
        second.setOwner("Romanov Oleg");
        Assert.assertEquals(first, second);
    }
}