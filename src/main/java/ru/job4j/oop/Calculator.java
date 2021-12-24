/**
 * @Раздел Блок 2. ООП / 1.2.1. Классы и объекты.
 * @Задание 1.9. Статические и не статические методы [#504806]
 * @Описание 1. Вернитесь к классу Calculator из задания и добавьте в него следующее:
 * - статический метод minus(),
 * который принимает число типа int и находит разницу между этим числом и полем x:
 * private static int x = 5;
 * - нестатический метод divide(), который принимает число типа int и
 * находит результат разделения переданного числа, на поле x.
 * - нестатический метод sumAllOperation(), который принимает число типа int и
 * находит результат суммирования всех операций:
 * sum(), multiply(), minus(), divide() и возвращает результат вычисления всех этих операций.
 * Обратите внимание, что метод должен быть именно нестатическим,
 * только в таком случае мы можем вызывать как статические метод, так и нестатические.
 * 2. В методе main продемонстрируйте как будете вызывать все созданные методы.
 * Обратите внимание, что для вызова нестатических методов необходимо создавать экземпляр класса.
 * @author Oleg Romanov
 * @since 23.12.2021
 * @version 2
 */
package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

     public  int divide(int z) {
        return z / x;
     }

    public  int sumAllOperation(int c) {
        return sum(c) + multiply(c) + minus(c) + minus(c) + divide(c);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(5));
        System.out.println(minus(1));
        System.out.println(calculator.divide(20));
        System.out.println(calculator.sumAllOperation(3));
    }
}
