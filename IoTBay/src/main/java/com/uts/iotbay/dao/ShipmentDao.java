/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.dao;

import com.uts.iotbay.model.Device;
import com.uts.iotbay.model.Order;
import com.uts.iotbay.model.Shipment;
import com.uts.iotbay.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShipmentDao extends BaseDao {

    public void createShipment(Shipment shipment) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into SHIPMENT (ORDERID, NAME, ADDRESS,PHONE,USERID, STATUS) values(?, ?, ?, ?, ?,?)");
            ps.setInt(1, shipment.getOrderId());
            ps.setString(2, shipment.getReceiverName());
            ps.setString(3, shipment.getShipmentAddress());
            ps.setString(4, shipment.getReceiverPhone());
            ps.setInt(5, shipment.getUserId());
            ps.setString(6, shipment.getStatus());
            ps.executeUpdate();
            System.out.println("shipment insert");
        } catch (SQLException ex) {
            Logger.getLogger(ShipmentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateShipment(Shipment shipment){
        try {
            PreparedStatement ps = connection.prepareStatement("update shipment set name=?, address=?, phone=? where id=?");
            ps.setString(1, shipment.getReceiverName() );
            ps.setString(2, shipment.getShipmentAddress());
            ps.setString(3, shipment.getReceiverPhone());
            ps.setInt(4, shipment.getId());
            ps.executeUpdate();
            System.out.println("update shipment set name="+shipment.getReceiverName()+", address="+shipment.getShipmentAddress()+", phone="+shipment.getReceiverPhone()+" where id="+shipment.getId()+"");
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void confirmShipmentById(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("update shipment set status='Confirmed' where id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteShipmentById(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("delete from shipment where id=?");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Shipment findShipmentById(int id){
    try {
            PreparedStatement ps = connection.prepareStatement("select * from shipment where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               return new Shipment(rs.getInt("id"), rs.getInt("orderid"), rs.getString("name"), rs.getString("address"), rs.getString("phone"), rs.getInt("userId"), rs.getString("status"), rs.getDate("shipment_date").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Shipment> getShipments(Integer userId, String shipmentId, String date) {
        
        List<Shipment> list = new ArrayList();
        try {
            PreparedStatement ps;
            if (shipmentId != null && !shipmentId.isEmpty()) {
                ps = connection.prepareStatement("select * from shipment where userid=? and id=?");
                ps.setInt(1, userId);
                ps.setInt(2, Integer.parseInt(shipmentId));
            } else if(date != null && !date.isEmpty()) {
                ps = connection.prepareStatement("select * from shipment where userid=? and shipment_date>=? and shipment_date <=?");
                ps.setInt(1, userId);
                ps.setString(2, date + " 00:00:00");
                ps.setString(3, date + " 23:59:59");
            } else {
                ps = connection.prepareStatement("select * from shipment where userid=?");
                ps.setInt(1, userId);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Shipment(rs.getInt("id"), rs.getInt("orderid"), rs.getString("name"), rs.getString("address"), rs.getString("phone"), rs.getInt("userId"), rs.getString("status"), rs.getDate("shipment_date").toString()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaymentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
