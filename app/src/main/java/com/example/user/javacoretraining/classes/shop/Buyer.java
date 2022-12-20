package com.example.user.javacoretraining.classes.shop;

public class Buyer extends User {

    private String address = "Unknown";
    private String phone = "0000";

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
