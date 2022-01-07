package ru.job4j.tracker;

import java.util.Arrays;

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
        /* Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }

        return rsl;
        упрощаем этот метод путем применения метода indexOff */
        /* находим индекс */
        int index = indexOff(id);
        /* Если индекс найден, то возвращаем объект item, иначе null */
        return index != -1 ? items[index] : null;
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

    /**
     * Первоначально нам нужно найти ячейку с id приходящим в параметр метода.
     * Мы уже реализовали методы для поиска по id, но этот метод возвращает объект Item, а не index.
     * Давайте создадим новый метод, который будет возвращать index ячейки массива (заявки) по id.
     */

    private int indexOff(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            /* можно обойтись без создания временного объекта, путем- if(items.getId() == id)*/
            if (item.getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Весь метод replace будет состоять из 5-6 строчек кода.
     * 1. Найти индекс ячейки по id.
     *
     * 2. Проставить id с item. При замене нужно сохранять старый id." - добавьте сеттер.
     * И слово "сохранять" в контексте имеет смысл - "использовать".
     * <p>
     * 3. Записать в ячейку с найденным индексом объект item.
     * Это входящий параметр." - подсказка - см. поля с типом Item.
     * <p>
     * 4. Вернуть true, если замена произведена или false, если index по id не найден.
     *
     * @param id   Это Id искомой заявки
     * @param item - объект/заявка, которую необходимо вставить
     * @return возвращает true, при успешном завершении операции
     */

    public boolean replace(int id, Item item) {
        int index = indexOff(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    /**
     * Метод удаления заявки. Так как мы не можем изменять размер массива, под удалением понимается
     * запись в ячейку массива нулевой ссылки - null.
     * Здесь мы используем ранее созданный метод indexOff, который возвращает нам индекс эелемента
     * массива по входному параметру метода- Id.
     * int index = indexOff(id);
     * int start = index + 1;
     * int length = size - index - 1; "-1" - так как size при заполненном массиве всегда size++.
     * System.arraycopy(items, start, items, index, length) - в самом коде все сокращено.
     * Оставлено только int index - для читабельсности.
     * @param id - Id удаляемой заявки.
     * @return true - при удачном удалении.
     */

    public boolean delete(int id) {
        int index = indexOff(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--; /* уменьшаем size, т.к. последняя ячейка  - null. */
            return true;
        }
        return false;
    }
}