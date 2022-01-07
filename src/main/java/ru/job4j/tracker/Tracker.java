package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    /**
     * items - массив для хранения заявок.
     */
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * В методе add реализована процедура добавления новой заявки
     * в массив, где хранятся все заявки.
     * @param item - аргумент метода- на вход метода поступает объект , т.е. новая заявка.
     * @return возвращает объект с присвоенным ключом "ads"
     */

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * Метод реализует поиск заявки по id.
     * @param id - это id заявки.
     * @return - возвращает объект - заявку.
     */
    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод ищет null элементы в массиве items, создает массив tmp и помещает
     * в него все не null элементы.
     * @return Item[].
     */

    public Item[] findAll() {
        Item[] tmp = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                tmp[count++] = items[i];
            }
        }
        return Arrays.copyOf(tmp, count);
    }

    /**
     * Метод ищет элеменнты массива items, совпадающие с "key" и помещает их в отдельный
     * массив.
     * @param key Имя в искомой заявке
     * @return Item[]
     */

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rsl[count++] = items[i];
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}