package com.example.user.javacoretraining.classes.exams;

public enum Mark {

    EXCELLENT(5),
    GOOD(4),
    ACCEPTABLE(3),
    NOT_ACCEPTABLE(2);

    private final int value;

    Mark(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
