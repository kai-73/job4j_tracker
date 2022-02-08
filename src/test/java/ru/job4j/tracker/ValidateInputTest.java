package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output output = new StubOutput();
        String[] answers = new String[]{"Oleg", "1"};
        Input in = new StubInput(answers);
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Все равно что");
        assertEquals(1, selected);
    }

    @Test
    public void whenInvalidInputSingleCorrect() {
        Output output = new StubOutput();
        String[] answers = new String[]{"1"};
        Input in = new StubInput(answers);
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Все равно что");
        assertEquals(1, selected);
    }

    @Test
    public void whenInvalidInputMutipleCorrect() {
        Output output = new StubOutput();
        String[] answers = new String[]{"0", "1", "3", "10"};
        Input in = new StubInput(answers);
        ValidateInput input = new ValidateInput(output, in);

        int selected1 = input.askInt("Все равно что");
        assertEquals(0, selected1);
        int selected2 = input.askInt("Все равно что");
        assertEquals(1, selected2);
        int selected3 = input.askInt("Все равно что");
        assertEquals(3, selected3);
        int selected4 = input.askInt("Все равно что");
        assertEquals(10, selected4);
    }

    @Test
    public void whenInvalidInputNegativeNumber() {
        Output output = new StubOutput();
        String[] answers = new String[]{"-1"};
        Input in = new StubInput(answers);
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Все равно что");
        assertEquals(-1, selected);
    }
}