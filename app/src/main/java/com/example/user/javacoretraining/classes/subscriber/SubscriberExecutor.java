package com.example.user.javacoretraining.classes.subscriber;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Исполнитель работы с абонентом
 * */
public class SubscriberExecutor {

    private ArrayList<Subscriber> list = new ArrayList<>();

    /**
     * Конструктор
     * Зполняет список 50 новыми абонентами
     * */
    public SubscriberExecutor(){
        list = new ArrayList<>();
        for(int i=0; i<50; i++){
            list.add(new Subscriber());
        }
    }

    /**
     * Печать списка
     * */
    public void printList(){
        for(Subscriber s : list)
            System.out.println(s);
    }

    /**
     * Печать абонентов, не превысивших порог по внутригородским звонкам
     * @param bound - граница времени в секндах
     * */
    public void printSubscribersInBoundsByTimeInCity(int bound){
        for(Subscriber s : list) {
            if(s.getTimeInCity().getTimeSeconds() < bound)
                System.out.println(s);
        }
    }

    /**
     * Печать абонентов, не превысивших порог по муждугородним звонкам
     * @param bound - граница времени в секндах
     * */
    public void printSubscribersInBoundsByTimeOutCity(int bound){
        for(Subscriber s : list) {
            if(s.getTimeOutCity().getTimeSeconds() < bound)
                System.out.println(s);
        }
    }

    /**
     * Печать абонентов, у кого есть междугородние звонки
     * */
    public void printSubscribersUsedCallsOutCity(){
        for(Subscriber s : list) {
            if(s.getTimeOutCity().getTimeSeconds() > 0)
                System.out.println(s);
        }
    }

    /**
     * Печать списка в алфавитном порядке
     * */
    public void printSubscribersAlphabetSort(){
        ArrayList<Subscriber> l1 = new ArrayList<>(list);
        l1.sort(new Comparator<Subscriber>() {
            @Override
            public int compare(Subscriber o1, Subscriber o2) {
                return o1.getFamilyName().compareTo(o2.getFamilyName());
            }
        });
        for(Subscriber s : l1){
            System.out.println(s);
        }
    }

}
