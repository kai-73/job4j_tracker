package ru.job4j.inheritance;

public class Engineer extends Profession {

    private Qualification qualification;

    public Engineer(String name, String surname, String education, String birthday, Qualification qualification) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public Project stage(Customer customer) {
        return new Project();
    }
}
