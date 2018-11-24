package com.example.productService;

public class Product {
    private String id;
    private String name;
    private String desc;
    private int price;
    private int store;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public Product(){

    }
    public Product(String id, String name, String desc, int price, int store) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.store = store;
    }

}