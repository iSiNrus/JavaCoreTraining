package com.example.user.javacoretraining.classes;

import android.graphics.PointF;

/**
 * III
 * <p>
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медиан.
 * Описать свойства для получения состояния объекта.
 */
public class Triangle {

    private PointF p1, p2, p3;

    private float sideA, sideB, sideC;

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        p1 = new PointF(x1, y1);
        p2 = new PointF(x2, y2);
        p3 = new PointF(x3, y3);

        sideA = getSideSize(p1, p2);
        sideB = getSideSize(p2, p3);
        sideC = getSideSize(p3, p1);
    }

    public PointF getP1() {
        return p1;
    }

    public PointF getP2() {
        return p2;
    }

    public PointF getP3() {
        return p3;
    }

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public Triangle(PointF p1, PointF p2, PointF p3) throws TriangleNotExistException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        sideA = getSideSize(p1, p2);
        sideB = getSideSize(p2, p3);
        sideC = getSideSize(p3, p1);

        if (!isTriangleExist()) throw new TriangleNotExistException();
    }

    /**
     * Расчет площади треугольника по формуле Герона
     * */
    public float square(){
        float p = this.perimeter() / 2;
        return (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    /**
     * Расчет периметра треугольника
     * @return периметр треугольника
     * */
    public float perimeter(){
        return sideA+sideB+sideC;
    }

    /**
     *  Точка пересечения медиан
     * @return PointF точка центр масс и пересечения медиан
     * */
    public PointF centerOfMass(){
        float x = (p1.x + p2.x + p3.x) / 3;
        float y = (p1.y + p2.y + p3.y) / 3;
        return new PointF(x, y);
    }
    /**
     * Проверка на существование треугольника
     * */
    private boolean isTriangleExist() {
        if (sideA >= sideB && sideA >= sideC)
            return sideA < sideB + sideC;
        if (sideB >= sideA && sideB >= sideC)
            return sideB < sideA + sideC;
        return sideC < sideB + sideA;
    }

    /**
     * Вычисление длины отрезка по двум точкам
     * @param a Первая точка
     * @param b Вторая точка
     * @return длина стороны
     * */
    private float getSideSize(PointF a, PointF b) {
        return (float) Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }
}

class TriangleNotExistException extends Exception {
}

