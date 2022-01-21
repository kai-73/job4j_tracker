package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "edited item"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertEquals("edited item", edited.getName());
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item", 1);
        tracker.add(item);
        String[] answers = {Integer.toString(item.getId())};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item del = tracker.findById(Integer.parseInt(answers[0]));
        assertNull(del);
    }
}