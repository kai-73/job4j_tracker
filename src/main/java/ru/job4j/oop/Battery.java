/**
 * @Раздел Блок 2. ООП / 1.2.1. Классы и объекты.
 * @Задание 1.8. Состояние объекта [#167388 #242715]
 * @Описание 1. 1. Создать класс ru.job4j.oop.Battery.
 * в нем должно быть поле private int load. Также необходимо в класс добавить следующее:
 * - конструктор следующего вида:
 *
 * public Battery(int load) {
 *     this.load = load;
 * }
 *
 * - геттер для поля следующего вида:
 *
 * public int getLoad() {
 *     return load;
 * }
 * 2. Создать метод public void exchange(Battery another).
 * Этот метод должен списывать заряд из батареи у кого вызывали метод exchange и
 * добавить к объекту another.
 * @author Oleg Romanov
 * @since 23.12.2021
 * @version 1
 */
package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

      public int getLoad() {
       return load;
      }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load -= this.load;
    }
}
