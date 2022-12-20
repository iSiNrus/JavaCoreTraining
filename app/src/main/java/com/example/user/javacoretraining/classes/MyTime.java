package com.example.user.javacoretraining.classes;


import androidx.annotation.NonNull;

/**
 * IV
 * <p>
 * Составить описание класса для представления времени.
 * Предусмотреть возможности установки времени и изменения его отдельных полей
 * (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей выбрасываются исключения.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class MyTime {

    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) throws WrongTimeException {
        if (hours < 0 || hours > 23) throw new WrongTimeException();
        else this.hours = hours;
    }

    public void setMinutes(int minutes) throws WrongTimeException {
        if (minutes < 0 || minutes > 59) throw new WrongTimeException();
        else this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws WrongTimeException {
        if (seconds < 0 || seconds > 59) throw new WrongTimeException();
        else this.seconds = seconds;
    }

    public void addHours(int dH) {
        if (hours + dH < 0) hours = 0;
        else hours = Math.abs((hours + dH) % 24);
    }

    public void addMinutes(int dM) {
        addHours((this.minutes + dM) / 60);
        this.minutes = Math.abs((this.minutes + dM) % 60);
    }

    public void addSeconds(int dS) {
        addMinutes((this.seconds + dS) / 60);
        this.seconds = Math.abs((this.seconds + dS) % 60);
    }

    @NonNull
    @Override
    public String toString() {
        String h = (hours < 10) ? "0" + hours : "" + hours;
        String m = (minutes < 10) ? "0" + minutes : "" + minutes;
        String s = (seconds < 10) ? "0" + seconds : "" + seconds;
        return h + ":" + m + ":" + s;
    }

    public int getTimeSeconds() {
        return hours * 60 * 60 + minutes * 60 + seconds;
    }
}

class WrongTimeException extends Exception {
}
