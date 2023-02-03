package com.codegym.model;

public class Product {
    private  int id;
    private String name;
    private String brand;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, String brand, String describe) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.describe = describe;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}