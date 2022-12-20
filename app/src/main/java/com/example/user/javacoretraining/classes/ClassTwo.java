package com.example.user.javacoretraining.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * II
 * <p>
 * Создать класс, содержащий динамический массив и количество элементов в нем.
 * Добавить конструктор, который выделяет память под заданное количество элементов.
 * Добавить методы, позволяющие заполнять массив случайными числами,
 * переставлять в данном массиве элементы в случайном порядке, находить количество
 * различных элементов в массиве, выводить массив на экран.
 */
public class ClassTwo {

    private ArrayList<Integer> array;
    private int arrayCapacity;

    /**
     * Конструктор
     *
     * @param arrayCapacity размер списка
     */
    public ClassTwo(int arrayCapacity) {
        array = new ArrayList<>(arrayCapacity);
        this.arrayCapacity = arrayCapacity;
    }

    /**
     * Заполняет массив случайными значениями
     *
     * @param bound граница случайных значений
     */
    public void fillRandomValues(int bound) {
        Random rd = new Random();
        for (int i = 0; i < arrayCapacity; i++)
            array.add(rd.nextInt(bound));
    }

    /**
     * Перемешать содержимое списка
     */
    public void shuffle() {
        Collections.shuffle(array);
    }

    /**
     * Вывод списка на экран
     */
    public void printArray() {
        System.out.println(array.toString());
    }

    /**
     * Количество уникальных элементов
     *
     * @return количество уникальных элементов
     */
    public int countUnicalValues() {
        Set<Integer> set = new HashSet<>(array);
        return set.size();
    }

}
