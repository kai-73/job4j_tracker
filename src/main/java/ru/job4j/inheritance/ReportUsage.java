/**
 * @Раздел Блок 2. ООП / 1.2.2. Наследование.
 * @Задание 3. Перегрузить метод max для трех чисел [#122644]
 * @Описание 1. Создайте класс JSONReport. Он должен наследоваться от TextReport.
 * Для переноса строки используйте метод System.lineSeparator().
 * Здесь символ \t означает табуляцию, т.е. отступ от начала строки.
 * 2. Переопределите методы generate. Этот метод должен вернуть шаблон в следующем формате.
 * @author Oleg Romanov.
 * @since 30.12.2021
 * @version 1
 */
package ru.job4j.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        JSONReport reportJSON = new JSONReport();
        HtmlReport report = new HtmlReport();
        String text = report.generate("Oleg", "body");
        System.out.println(text);
    }
}
