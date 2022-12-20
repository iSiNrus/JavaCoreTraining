package com.example.user.javacoretraining.classes;

/**
 * I
 * <p>
 * Создать класс с двумя переменными. Добавить функцию вывода на экран
 * и функцию изменения этих переменных. Добавить функцию, которая находит
 * сумму значений этих переменных, и функцию, которая находит наибольшее
 * значение из этих двух переменных.
 */
public class ClassOne {

    /**
     * Первое поле
     */
    private int p1;
    /**
     * Второе поле
     */
    private int p2;

    /**
     * Устанавливает значение в первое поле
     *
     * @param p1 новое значение первого поля
     */
    public void setP1(int p1) {
        this.p1 = p1;
    }

    /**
     * Устанавливает значение во второе поле
     *
     * @param p2 новое значение второго поля
     */
    public void setP2(int p2) {
        this.p2 = p2;
    }

    /**
     * Выводит на экран значение поля p1
     */
    public void printP1() {
        System.out.println(p1);
    }

    /**
     * Выводит на экран значение поля p2
     */
    public void printP2() {
        System.out.println(p2);
    }

    /**
     * Находит наибольшее из двух полей
     *
     * @return наибольшее значение из двух полей
     */
    public int getBigger() {
        return Math.max(p1, p2);
    }

    /**
     * Поиск суммы двух значений
     *
     * @return значение суммы двух полей
     */
    public int getSum() {
        return p1 + p2;
    }

}
