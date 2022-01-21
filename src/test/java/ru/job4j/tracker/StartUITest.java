package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        String[] answers = {"Oleg"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Oleg");
        assertEquals(expected.getName(), created.getName());
    }
}