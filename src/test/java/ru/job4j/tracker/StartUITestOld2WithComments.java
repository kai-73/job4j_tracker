package ru.job4j.tracker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class StartUITestOld2WithComments {

    @Test
    public void whenCreateItem() {
        String[] answers = {"0", "Item name", "1"};
        Input in = new StubInput(answers);
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        UserAction[] actions = {
                new CreateItem(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        Item result = tracker.findAll()[0];
        assertThat(result.getName(), is("Item name"));
    }

    @Test
    public void whenFindAllOneVersion() {
        Tracker tracker = new Tracker();
        Item one = new Item("TEST1");
        tracker.add(one);
        Item[] items = tracker.findAll();
        /* Item result = tracker.findAll()[0]; */
        /* assertThat(result.getName(), is(first.getName())); */
        Output out = new StubOutput();
        String[] answers = {"0",
                "1"};
        Input in = new StubInput(answers);
        UserAction[] actions = {
                new ShowAllItems(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("===== Menu:====" + ln
                + "0. Show all items" + ln
                + "1. Exit Program" + ln
                + "=== Show all items ===" + ln
                + items[0] + ln
                + "===== Menu:====" + ln
                + "0. Show all items"  + ln
                + "1. Exit Program" + ln
                + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindAllTwoVersion() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("TEST1"));
        Item result = tracker.findAll()[0];
        Output out = new StubOutput();
        String[] answers = {"0",
                "1"};
        Input in = new StubInput(answers);
        UserAction[] actions = {
                new ShowAllItems(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("===== Menu:====" + ln
                + "0. Show all items" + ln
                + "1. Exit Program" + ln
                + "=== Show all items ===" + ln
                + result + ln
                + "===== Menu:====" + ln
                + "0. Show all items"  + ln
                + "1. Exit Program" + ln
                + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindAllThirdVersion() {
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("TEST1"));
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0",
                "1"});
        UserAction[] actions = {
                new ShowAllItems(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("===== Menu:====" + ln
                + "0. Show all items" + ln
                + "1. Exit Program" + ln
                + "=== Show all items ===" + ln
                + one + ln
                + "===== Menu:====" + ln
                + "0. Show all items"  + ln
                + "1. Exit Program" + ln
                + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("Test1"));
        String[] answers = {"0", one.getName(), "1"};
        Input in = new StubInput(answers);
        Output out = new StubOutput();
        UserAction[] actions = {
                new FindItemByName(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("===== Menu:====" + ln
                + "0. Find items by name" + ln
                + "1. Exit Program" + ln
                + "=== Find items by name  ===" + ln
                + one + ln
                + "===== Menu:====" + ln
                + "0. Find items by name" + ln
                + "1. Exit Program" + ln
                + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindByIdOneVersion() {
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("Test1"));
        String[] answers = {"0", String.valueOf(one.getId()), "1"};
        Input in = new StubInput(answers);
        Output out = new StubOutput();
        UserAction[] actions = {
                new FindItemById(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("===== Menu:====" + ln
                + "0. Find item by id" + ln
                + "1. Exit Program" + ln
                + "=== Find item by id ===" + ln
                + one + ln
                + "===== Menu:====" + ln
                + "0. Find item by id" + ln
                + "1. Exit Program" + ln
                + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindByIdTwoVersion() {
        Tracker tracker = new Tracker();
        Item one = new Item("Test1");
        tracker.add(one);
        Item result = tracker.findAll()[0];
        int id = one.getId();
        String[] answers = {"0", String.valueOf(id), "1"};
        Input in = new StubInput(answers);
        Output out = new StubOutput();
        UserAction[] actions = {
                new FindItemById(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("===== Menu:====" + ln
                + "0. Find item by id" + ln
                + "1. Exit Program" + ln
                + "=== Find item by id ===" + ln
                + result + ln
                + "===== Menu:====" + ln
                + "0. Find item by id" + ln
                + "1. Exit Program" + ln
                + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        /*Item item = new Item("Replace Item"); */
        /*tracker.add(item); ?????? 2 ???????????? ??/?? ???????????????? ?????????? - ????????*/
        Item item = tracker.add(new Item("Test1"));
        int id = item.getId();
        String replaceName = "New Test item";
        String[] answers = {"0", String.valueOf(id), replaceName, "1"};
        Input in = new StubInput(answers);
        /* ?????? ?????????????? ???????????? ??/?? ???????????????? ??????????*/
        /* Input in = new StubInput(
            new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}*/
        Output out = new StubOutput();
        UserAction[] actions = {
                new EditItem(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("===== Menu:====" + ln
                + "0. Edit item" + ln
                + "1. Exit Program" + ln
                + "=== Edit item ===" + ln
                /*Item one = tracker.add(new Item("test1"));*/
                + "???????????? ???????????????? ??????????????." + ln
                + "===== Menu:====" + ln
                + "0. Edit item" + ln
                + "1. Exit Program" + ln
                + "=== Exit Program ===" + ln
        ));
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
                new DeleteItem(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        Assertions.assertNull(tracker.findById(id));
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
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("===== Menu:====" + ln
                + "0. Exit Program" + ln
                + "=== Exit Program ===" + ln
        ));
    }
}