package com.example.user.javacoretraining.classes.exams;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Факультет
 * */
public class Facultet {

    private Long Id;
    private String name;

    private LinkedList<Enrollee> enrollees;
    private LinkedList<Student> students;
    private ArrayList<Teacher> teachers;

    private int quoteStudents;

    public Facultet(int quoteStudents){
        this.quoteStudents = quoteStudents;
    }

    /**
     * Зачисляет абитуриентов на факультет в список студентов
     * @param amountStudents количество студентов для зачисления
     * @return количество зачисленных абитуриентов
     * @throws QuoteStudentsOverflowException в случае, если amountStudents > quoteStudents,
     * то есть количество зачисляемых больше, чем свободных мест
     * */
    public int enroll(int amountStudents) throws QuoteStudentsOverflowException {
        if(amountStudents > quoteStudents) throw new QuoteStudentsOverflowException();
        else {
            enrollees.sort((o1, o2) -> Float.compare(o1.getAvgMark(), o2.getAvgMark()));
            int i=0;
            for(; i<amountStudents; i++){
                Enrollee e = enrollees.poll();
                if(e!=null) {
                    students.add(new Student(e));
                    quoteStudents--;
                }
                else break;
            }
            return i;
        }
    }

    /**
     * Поставить экзамен экзаменуемому
     * @param examiner - Экзаменуемый (абитуриент или студент)
     * @param teacher - Экзаменатор, преподаватель
     * @param subject - дисциплина
     * @param mark - оценка
     * */
    public void exam(Examiner examiner, Teacher teacher, String subject, Mark mark){
        examiner.addExam(new Exam(subject, teacher, mark));
    }

}
