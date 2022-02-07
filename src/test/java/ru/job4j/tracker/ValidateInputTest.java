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
        int[] selected = new int[answers.length];
        for (int i = 0; i < selected.length; i++) {
            selected[i] = input.askInt("Все равно что");
            assertEquals(Integer.parseInt(answers[i]), selected[i]);
        }
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