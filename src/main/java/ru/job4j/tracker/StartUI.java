package ru.job4j.tracker;

/**
 * Этот класс управляет меню.
 */

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;

        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("===== Menu:====");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        UserAction[] actions = {
                new CreateItem(output),
                new ShowAllItems(),
                new EditItem(),
                new DeleteItem(),
                new FindItemById(),
                new FindItemByName(),
                new ExitProgram()
        };
        new StartUI(output).init(input, tracker, actions);
    }
}
