package com.example.user.javacoretraining.classes.exams;

public abstract class Person {

    private long Id;
    private String name;

    public Person(long id, String name){
        this.Id = id;
        this.name = name;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
