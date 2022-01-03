package ru.job4j.encapsulation;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        Calendar calendar = new GregorianCalendar(2021, 8, 25);
        Date date = calendar.getTime();
        student.setFullName("Romanov Oleg Anatolievich");
        student.setStudentGroup(2201);
        student.setReceipt(new Date());

        System.out.println(student.getFullName() + ". Date of receipt - " + student.getReceipt() +  " : group - " + student.getStudentGroup());
    }
}
