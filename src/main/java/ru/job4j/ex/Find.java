package ru.job4j.ex;
/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 3. Замена if-else-throw на if-throw. [49895#271520]
 * @Описание 1. Приведен код класса Find. Избавьтесь от блока if-else-throw.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Oleg Romanov
 * @since 06.02.2022
 * @version 1
 */
public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Find.get(data, 3);
        System.out.println(rsl);
    }
}
