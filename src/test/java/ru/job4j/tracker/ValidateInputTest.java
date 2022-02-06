package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new StubInput(new String[]{"Oleg", "1"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Все равно что");
        assertEquals(1, selected);
    }
}