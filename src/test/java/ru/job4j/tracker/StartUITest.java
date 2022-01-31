package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;

class StartUITest {

    @Test
    public void whenCreateItem() {
        String[] answers = {"0", "Item name", "1"};
        Input in = new StubInput(answers);
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        UserAction[] actions = {
                new CreateItem(out),
                new ExitProgram()
        };
        new StartUI(out).init(in, tracker, actions);
        Item result = tracker.findAll()[0];
        assertThat(result.getName(), is("Item name"));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Replace Item");
        tracker.add(item);
        int id = item.getId();
        String replacedName = "New item";
        String[] answers = {"0", String.valueOf(id), replacedName, "1"};
        Input in = new StubInput(answers);
        Output out = new StubOutput();
        UserAction[] actions = {
                new EditItem(),
                new ExitProgram()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(id).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Delete item");
        tracker.add(item);
        int id = item.getId();
        String[] answers = {"0", String.valueOf(id), "1"};
        Input in = new StubInput(answers);
        Output out = new StubOutput();
        UserAction[] actions = {
                new DeleteItem(),
                new ExitProgram()
        };
        new StartUI(out).init(in, tracker, actions);
        assertNull(tracker.findById(id));
        /* assertThat(tracker.findById(item.getId()), is(nullValue())); */
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitProgram()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. Exit" + System.lineSeparator()
        ));
    }
}