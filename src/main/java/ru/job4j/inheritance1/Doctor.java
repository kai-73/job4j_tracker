package ru.job4j.inheritance1;

public class Doctor extends Profession {
    private Experience experience;

    public Doctor(String name, String surname, String education, String birthday, Experience experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public Experience getExperience() {
        return experience;
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis primary = new Diagnosis();
        return primary;
    }
}
