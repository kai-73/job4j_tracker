package ru.job4j.ex;
/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 3. Замена if-else-throw на if-throw. [49895#271520]
 * @Описание 1. Практика работы с исключениями (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Oleg Romanov
 * @since 06.02.2022
 * @version 1
 */
public class Config {
    public static void load(String path) {
        if (path == null) {
            throw new IllegalStateException("Path could not by null.");
        }
        System.out.println("load config by " + path);
    }

    public static void main(String[] args) {
        load("jdbc://localhost:8080");
    }
}
