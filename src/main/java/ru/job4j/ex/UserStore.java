package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User is not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() <= 3) {
            throw new UserInvalidException("User is not valid");
        }
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
