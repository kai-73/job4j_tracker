package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean act, int stat, String mess) {
        this.active = act;
        this.status = stat;
        this.message = mess;
    }

    public void show() {
        System.out.println("Ошибка активна? - " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 404, "Not Found");
        Error error2 = new Error(false, 500, "Internal Server Error");
        Error error3 = new Error(true, 200, "Ok");
        error1.show();
        error2.show();
        error3.show();
    }
}
