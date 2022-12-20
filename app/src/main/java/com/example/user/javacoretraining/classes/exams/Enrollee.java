package com.example.user.javacoretraining.classes.exams;

import java.util.LinkedList;

/**
 * Абитуриент
 * */
public class Enrollee extends Examiner {

    /**
     * Список сданных экзаменов
     * */
    private LinkedList<Exam> exams;

    public Enrollee(long id, String name) {
        super(id, name);
        exams = new LinkedList<>();
    }

    /**
     * Подсчет среднеого арифметического оценок за экзамены
     * @return float значение средней оценки
     * */
    public float getAvgMark() {
        float sum = 0f;
        for(Exam e : exams){
            sum += e.getMark().getValue();
        }
        return sum/ exams.size();
    }

}
