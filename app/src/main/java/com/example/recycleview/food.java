package com.example.recycleview;

public class food {
    int photo;
    String name;
    String desc;
    int price;

    public food(int photo, String name, String desc, int price){
        this.photo = photo;
        this.desc = desc;
        this.name = name;
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrice() {
        return price;
    }
}
