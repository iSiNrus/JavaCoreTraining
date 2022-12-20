package com.example.user.javacoretraining.classes.exams;

/**
 * Студент, зачисленный на факултет
 * */
public class Student extends Examiner {

    private int group;
    private float stipendia;

    public Student(Enrollee enrollee) {
        super(enrollee.getId(), enrollee.getName());
        group = 1;
        stipendia = 4500.00f;
    }

}
