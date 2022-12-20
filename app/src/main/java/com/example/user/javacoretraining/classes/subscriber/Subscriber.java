package com.example.user.javacoretraining.classes.subscriber;

import com.example.user.javacoretraining.classes.MyTime;

import java.util.ArrayList;
import java.util.UUID;

/**
 * V
 * <p>
 * Класс Абонент: Идентификационный номер, Фамилия, Имя, Отчество, Адрес,
 * Номер кредитной карточки, Дебет, Кредит, Время междугородных и городских переговоров;
 * Конструктор; Методы: установка значений атрибутов, получение значений атрибутов,
 * вывод информации. Создать массив объектов данного класса.
 * Вывести сведения относительно абонентов, у которых время городских переговоров
 * превышает заданное.  Сведения относительно абонентов, которые пользовались
 * междугородной связью. Список абонентов в алфавитном порядке.
 */
public class Subscriber {
    private Long ID;
    private String familyName;
    private String name;
    private String fatherName;
    private String address;
    private Long cardNumber;
    private Long debit;
    private Long credit;
    private MyTime timeOutCity;
    private MyTime timeInCity;

    public Subscriber(Long ID,
                      String familyName,
                      String name,
                      String fatherName,
                      String address, Long cardNumber,
                      Long debit, Long credit,
                      MyTime timeOutCity, MyTime timeInCity)
    {
        this.ID = ID;
        this.familyName = familyName;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.debit = debit;
        this.credit = credit;
        this.timeOutCity = timeOutCity;
        this.timeInCity = timeInCity;
    }

    public Subscriber(){
        ID = UUID.randomUUID().getMostSignificantBits();
        familyName = "Family#"+ID.shortValue();
        name = "Name#"+ID.shortValue();
        fatherName = "SecondName#"+ID.shortValue();
        address = "Address#"+ID.shortValue();
        cardNumber = ID;
        debit = ID;
        credit = ID;
        timeOutCity = new MyTime();
        timeOutCity.addSeconds(ID.intValue());
        timeInCity = new MyTime();
        timeInCity.addMinutes(ID.intValue());
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "ID=" + ID +
                ", familyName='" + familyName + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", debit=" + debit +
                ", credit=" + credit +
                ", timeOutCity=" + timeOutCity +
                ", timeInCity=" + timeInCity +
                '}';
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getDebit() {
        return debit;
    }

    public void setDebit(Long debit) {
        this.debit = debit;
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }

    public MyTime getTimeOutCity() {
        return timeOutCity;
    }

    public void setTimeOutCity(MyTime timeOutCity) {
        this.timeOutCity = timeOutCity;
    }

    public MyTime getTimeInCity() {
        return timeInCity;
    }

    public void setTimeInCity(MyTime timeInCity) {
        this.timeInCity = timeInCity;
    }
}

