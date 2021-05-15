/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.iotbay.model;

public class Order {
    private int id;
    private int deviceId;
    private String deviceName;
    private double price;
    private int quantity;
    private String name;
    private String address;
    private String phone;
    private int userId;
    private String status;

    public Order(int deviceId, String deviceName, double price, int quantity, String name, String address, String phone, int userId, String status) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.userId = userId;
        this.status = status;
    }

    public Order(int id, int deviceId, String deviceName, double price, int quantity, String name, String address, String phone, int userId, String status) {
        this.id = id;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.userId = userId;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
