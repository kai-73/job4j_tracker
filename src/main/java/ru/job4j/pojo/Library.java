package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book martin = new Book("Clean code", 200);
        Book turgenev = new Book("Mumu", 96);
        Book pushkin = new Book("Poems", 120);
        Book tolstoy = new Book("War and Peace", 1000);
        Book[] library = new Book[4];
        library[0] = martin;
        library[1] = turgenev;
        library[2] = pushkin;
        library[3] = tolstoy;
        for (int i = 0; i < library.length; i++) {
            Book bk = library[i];
            System.out.println(bk.getName() + " - " + bk.getNumber());
        }
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        System.out.println();
        for (int i = 0; i < library.length; i++) {
            Book bk = library[i];
            System.out.println(bk.getName() + " - " + bk.getNumber());
        }
        System.out.println();
        for (int i = 0; i < library.length; i++) {
            Book bk = library[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getNumber());
            }
        }
    }
}
