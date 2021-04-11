package com.company;

public class Phone {
    private String name;

    private int price;

    Phone (String name,  int price){
        this.name=name;
        this.price=price;
    }

    String getName() {return name;}
    void setName(String name){this.name=name;}
    int getPrice(){return price;}
    void setPrice(int price){this.price=price;}

}
