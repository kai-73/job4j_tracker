package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String category;

    public Surgeon(String name, String surname, String education, String birthday, Experience experience, String category) {
        super(name, surname, education, birthday, experience);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void operation(Pacient pacient) {
    }
}
