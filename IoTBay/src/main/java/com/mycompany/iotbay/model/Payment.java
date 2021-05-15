/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.iotbay.model;

public class Payment {
    private int id;
    private int orderId;
    private int userId;
    private double amount;
    private String method;
    private String cardNumber;
    private String cardName;
    private String cvv;
    private String status;
    private String time;

    public Payment(int id, int orderId, int userId, double amount, String method, String cardNumber, String cardName, String cvv) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.amount = amount;
        this.method = method;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cvv = cvv;
    }

    
    public Payment(int orderId, int userId, double amount, String method, String cardNumber, String cardName, String cvv) {
        this.orderId = orderId;
        this.userId = userId;
        this.amount = amount;
        this.method = method;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cvv = cvv;
    }

    public Payment(int id, int orderId, int userId, double amount, String method, String cardNumber, String cardName, String cvv, String status, String time) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.amount = amount;
        this.method = method;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cvv = cvv;
        this.status = status;
        this.time = time;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
   
}
