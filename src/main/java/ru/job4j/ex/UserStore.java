package ru.job4j.ex;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0.5. Иерархия исключений и множественный catch. [219368#271525]
 * @Описание 1. Создайте класс ru.job4j.ex.UserNotFoundException наследника от Exception.
 * 2. Создайте класс ru.job4j.ex.UserInvalidException наследника от UserNotFoundException.
 * 3. Создайте класс ru.job4j.ex.UserStore.
 * 4. Вам необходимо реализовать метод findUser, validate и main.
 * - findUser - если пользователя не нашли в списке, то кинуть исключение UserNotFoundException.
 * - validate - если пользователь не валидный или если имя пользователя состоит из менее трех символов, то кинуть
 * исключение UserInvalidException.
 * Метод validate принимает аргумент user. У объекта user есть метод isValid(). Если он false, то нужно выкинуть
 * исключение UserInvalidException.
 * Так же в этом методе нужно проверить, что у объекта user количество символов в поле username меньше 3.
 * Если оно меньше, то нужно выкинуть исключение UserInvalidException. Для этого нужно воспользоваться методом
 * String.lenght().
 * - main - поправить код за счет использования try-catch с множественным блоком catch.
 * В блоке catch(UserNotFoundException) - должно быть выведено на консоль сообщение, что пользователя не найдено.
 * В блоке  catch(UserInvalidException) - должно быть выведено на консоль сообщение, что пользователь не валидный.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 17.06.2021
 * @version 1
 */

public class UserStore {
    /**
     * Метод для поиска имени пользователя
     * @param users массив всех пользователей
     * @param login имя пользователя, которое ищем в массиве
     * @return найденный объект User или выкидывает исключение UserNotFoundException
     * @throws UserNotFoundException если пользователь не найден
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        /* Поиск пользователя */
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                /*Пользователь найден -> завершение работы,*/
                /*возвращаем пользователя*/
                return user;
            }
        }
        /* Пользователь не найден - кидаем прерывание */
        throw new UserNotFoundException("User is not found");
    }

    /**
     * Метод для проверки правильности/доступа пользователя
     * @param user массив всех пользователей
     * @return true - если объект доступен = валиден, или кидаем прерывание UserInvalidException - если не валиден
     * @throws UserInvalidException если пользователь невалиден
     */

    public static boolean validate(User user) throws UserInvalidException {
        /* Проверка длины поля и объекта на валидность*/
        if (!user.isValid() || user.getUsername().length() <= 3) {
            /* Длина поля меньше 3 и объект не валиден -> кидаем прерывание */
            throw new UserInvalidException("User is not valid");
        }
        /* сбъектом user  все хорошо*/
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Oleg Romanov", false)
        };
        try {
            User user = findUser(users, "Oleg Romanov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ea) {
            ea.printStackTrace();
            System.out.println("Пользователь не валидный.");
        } catch (UserNotFoundException eb) {
            eb.printStackTrace();
            System.out.println("Пользователь не найден.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
