package com.example.user.javacoretraining.classes.exams;

import java.util.LinkedList;

/**
 * Экзаенуемый
 * */
public abstract class Examiner extends Person {

    private LinkedList<Exam> exams;

    public Examiner(long id, String name) {
        super(id, name);
    }

    public void addExam(Exam e){
        exams.add(e);
    }

    public LinkedList<Exam> getExams() {
        return exams;
    }

    public void setExams(LinkedList<Exam> exams) {
        this.exams = exams;
    }
}
