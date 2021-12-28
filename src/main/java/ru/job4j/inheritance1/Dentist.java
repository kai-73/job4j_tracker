package ru.job4j.inheritance1;

public class Dentist extends Doctor {
    private  String specialization;

    public Dentist(String name, String surname, String education, String birthday, Experience experience, String specialization) {
        super(name, surname, education, birthday, experience);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void putRecipe(Pacient pacient) {
    }
}
