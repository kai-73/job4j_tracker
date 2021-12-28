package ru.job4j.inheritance1;

public class Builder extends Engineer {
    private static String deadline;

    public Builder(String name, String surname, String education, String birthday, Qualification qualification, String deadline) {
        super(name, surname, education, birthday, qualification);
        this.deadline = deadline;
    }

    public static String result() {
        return deadline == GeneralDeadline.getDay() ? Prikaz.getPrize() : Prikaz.getFire();
    }

    public static void main(String[] args) {
        deadline = "1.01.2022";
        Prikaz.show(result());
    }
}

