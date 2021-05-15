/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.iotbay.model;

public class Device {
    private int id;
    private String name;
    private String type;
    private double price;
    private int stock;

    public Device(String name, String type, double price, int stock) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }

    public Device(int id, String name, String type, double price, int stock) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.stock = stock;
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

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

 

    @Override
    public String toString() {
        return "";
        //return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone + ", role=" + role + '}';
    }
    
    
    
}
