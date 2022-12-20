package com.example.user.javacoretraining.classes.exams;

/**
 * Преподаватель, экзаменатор
 * */
public class Teacher extends Person {

    private String PhD;


    public Teacher(long id, String name) {
        super(id, name);
    }

    public String getPhD() {
        return PhD;
    }

    public void setPhD(String phD) {
        PhD = phD;
    }
}
