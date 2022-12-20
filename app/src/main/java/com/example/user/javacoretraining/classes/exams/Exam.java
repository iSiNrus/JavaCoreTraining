package com.example.user.javacoretraining.classes.exams;

/**
 * Экзамен
 * */
public class Exam {

    private String subjectName;
    private Teacher examinater;
    private Mark mark;

    public Exam(String subjectName, Teacher examinater, Mark mark) {
        this.subjectName = subjectName;
        this.examinater = examinater;
        this.mark = mark;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher getExaminater() {
        return examinater;
    }

    public void setExaminater(Teacher examinater) {
        this.examinater = examinater;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
}
