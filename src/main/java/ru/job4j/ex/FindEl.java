package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] valiue, String key) throws UserInputException {
        int rsl = -1;
        for (int i = 0; i < valiue.length; i++) {
            if (valiue[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
             throw new UserInputException("Ключ не найден");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] example = new String[]{"Аты", "баты", "шли",
                "солдаты", "шли", "солдаты", "на", "войну"};
        String keynumber = example[6];
        String keyword = "Oleg";
        try {
            System.out.println(indexOf(example, keyword));
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
