package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] valiue, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < valiue.length; i++) {
            if (valiue[i].equals(key)) {
                rsl = i;
                System.out.println("Ключ - " + valiue[i]);
                break;
            }
        }
        if (rsl == -1) {
             throw new ElementNotFoundException("Ключ не найден");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String abus : abuses) {
            if (value.equals(abus)) {
                System.out.println("Отловили запрещенный ключ- " + abus);
                throw new ElementAbuseException("Запрещенный ключ." + abus);
            }
        }
        System.out.println("Ключ не входит в список запрещенных ключей.");
        return true;
    }

    public static void process(String[] value, String key, String[] abuses) {
        try {
            if (indexOf(value, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementNotFoundException ea) {
            ea.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *Если классы находятся в одной ветке иерархии, как выше,
     * то первым должен обрабатываться самый нижний класс в иерархии.
     * В нашем случае это ElementAbuseException.
     * В большинстве случаев нам нет нужды ловить конкретные исключения.
     * В этом случае можно указать один блок catch с классом Exception.
     * try {
     *         if (indexOf(values, key) != -1) {
     *             sent(key, abuses);
     *         }
     *     } catch (Exception e) {
     *         e.printStackTrace();
     *     }
     */

    public static void main(String[] args) {
        String[] example = new String[]{"Аты", "баты", "шли",
                "солдаты", "шли", "солдаты", "на", "лузер", "войну"};
        String keynumber = example[6];
        String keyword = "лузер";
        String[] abuses = new String[]{"лошара", "даун", "лузер"};
        process(example, keyword, abuses);
    }
}
