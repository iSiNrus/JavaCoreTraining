package com.example.user.javacoretraining.classes.shop;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Интернет-магазин
 * */
public class Shop {

    private ArrayList<Buyer> buyers;
    private ArrayList<Seller> sellers;
    private LinkedList<Order> orders;
    private LinkedList<Buyer> blackList;

    public Shop(){
        buyers = new ArrayList<>();
        sellers = new ArrayList<>();
        orders = new LinkedList<>();
        blackList = new LinkedList<>();
    }

    public void createOrder(Buyer buyer, Seller seller, ArrayList<Item> items){
        if(!blackList.contains(buyer))
        orders.add(new Order(buyer, seller, items));
    }

    public void addSeller(Seller seller){
        sellers.add(seller);
    }

    public void addBuyer(Buyer buyer){
        buyers.add(buyer);
    }

    public void addBuyerToBlackList(Buyer buyer){
        blackList.add(buyer);
    }

    public ArrayList<Buyer> getBuyers() {
        return buyers;
    }

    public ArrayList<Seller> getSellers() {
        return sellers;
    }

    public LinkedList<Order> getOrders() {
        return orders;
    }

    public LinkedList<Buyer> getBlackList() {
        return blackList;
    }
}
