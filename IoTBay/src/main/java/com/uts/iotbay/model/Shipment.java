/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uts.iotbay.model;

public class Shipment {
    private int id;
    private int orderId;
    private String receiverName;

    public Shipment(int id, int orderId, String receiverName, String shipmentAddress, String receiverPhone) {
        this.id = id;
        this.orderId = orderId;
        this.receiverName = receiverName;
        this.shipmentAddress = shipmentAddress;
        this.receiverPhone = receiverPhone;
    }
    private String shipmentAddress;
    private String receiverPhone;
    private int userId;
    private String status;
     private String time;

    public Shipment(int orderId, String receiverName, String shipmentAddress, String receiverPhone, int userId, String status) {
        this.orderId = orderId;
        this.receiverName = receiverName;
        this.shipmentAddress = shipmentAddress;
        this.receiverPhone = receiverPhone;
        this.userId = userId;
        this.status = status;
    }

    public Shipment(int id, int orderId, String receiverName, String shipmentAddress, String receiverPhone, int userId, String status, String time) {
        this.id = id;
        this.orderId = orderId;
        this.receiverName = receiverName;
        this.shipmentAddress = shipmentAddress;
        this.receiverPhone = receiverPhone;
        this.userId = userId;
        this.status = status;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getShipmentAddress() {
        return shipmentAddress;
    }

    public void setShipmentAddress(String shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    
    
}
