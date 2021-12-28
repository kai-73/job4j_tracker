package ru.job4j.inheritance1;

public class Programmer extends Engineer {
    private String knowledge;

    public Programmer(String name, String surname, String education, String birthday, Qualification qualification, String knowledge) {
        super(name, surname, education, birthday, qualification);
        this.knowledge = knowledge;
    }

    public boolean satisfaction(Language language) {
        return knowledge == "Java";
    }
}
