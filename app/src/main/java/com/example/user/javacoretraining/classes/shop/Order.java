package com.example.user.javacoretraining.classes.shop;

import java.util.ArrayList;

/**
 * Заказ
 * */
public class Order {

    private Buyer buyer;
    private Seller seller;
    private ArrayList<Item> items;
    private Status status;

    /**
     * Заказ
     * @param b Покупатель
     * @param s Продавец
     * @param items список товаров
     * */
    public Order(Buyer b, Seller s, ArrayList<Item> items){
        buyer = b;
        seller = s;
        this.items = items;
        status = Status.Pending;

        for(Item item : items)
            item.setBalance(item.getBalance()-1);
    }

    /**
     * Оплата заказа
     * */
    public void pay(){
        status = Status.InProcess;
    }

    /**
     * Продавец принимает заказ
     * */
    public void confirmOrder(){
        status = Status.Invoiced;
    }

    /**
     * Завершение заказа
     * */
    public void close(){
        status = Status.Closed;
    }
    /**
     * Отмена заказа
     * */
    public void reject(){
        status = Status.Rejected;
    }
}
