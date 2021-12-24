/**
 * @Раздел Блок 2. ООП / 1.2.1. Классы и объекты.
 * @Задание 3. Перегрузить метод max для трех чисел [#122644]
 * @Описание 1. В классе ru.job4j.condition.Max из задания 4.2. Максимум из двух чисел
 * добавить перегруженный метод max для трех и четырех чисел.
 * Постарайтесь, аналогично, примеру из задания переиспользовать уже существующие методы.
 * 2. Написать тесты.
 * @author Oleg Romanov
 * @since 24.12.2021
 * @version 1
 */
package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int num1, int num2, int num3) {
        return max(num1, max(num2, num3));
    }

    public static int max(int num1, int num2, int num3, int num4) {
        return max(
                num1, max(num2, num3, num4)
        );
    }
}

