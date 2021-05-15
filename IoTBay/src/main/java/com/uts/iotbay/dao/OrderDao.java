/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.dao;

import com.uts.iotbay.model.Device;
import com.uts.iotbay.model.Order;
import com.uts.iotbay.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderDao extends BaseDao {

    public void createOrder(Order order) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into orders(deviceId, deviceName,  price,  quantity,  name,  address,  phone,  userId, status) values(?, ?, ?, ?, ?,?,?,?,?)");
            ps.setInt(1, order.getDeviceId());
            ps.setString(2, order.getDeviceName());
            ps.setDouble(3, order.getPrice());
            ps.setInt(4, order.getQuantity());
            ps.setString(5, order.getName());
            ps.setString(6, order.getAddress());
            ps.setString(7, order.getPhone());
            ps.setInt(8, order.getUserId());
            ps.setString(9, order.getStatus() );
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateOrder(Order order) {
        try {
            PreparedStatement ps = connection.prepareStatement("update orders set quantity=?, name=?, address=?, phone=? where id=?");
            
            ps.setInt(1, order.getQuantity());
            ps.setString(2, order.getName());
            ps.setString(3, order.getAddress());
            ps.setString(4, order.getPhone());
            ps.setInt(5, order.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Order> allOrders(int id) {
        List<Order> orderList = new ArrayList();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from orders where userId=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                orderList.add(new Order(rs.getInt("id"),rs.getInt("deviceId"),rs.getString("deviceName"),rs.getDouble("price"),rs.getInt("quantity"),rs.getString("name"), rs.getString("address"),rs.getString("phone"),rs.getInt("userId"),rs.getString("status")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return orderList;
    }
    
    public Order findOrderById(int id){
    try {
            PreparedStatement ps = connection.prepareStatement("select * from orders where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Order order = new Order(rs.getInt("id"),rs.getInt("deviceId"),rs.getString("deviceName"),rs.getDouble("price"),rs.getInt("quantity"),rs.getString("name"), rs.getString("address"),rs.getString("phone"),rs.getInt("userId"),rs.getString("status"));
                return order;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void confirmOrder(int id) {
         try {
            PreparedStatement ps = connection.prepareStatement("update orders set status='Confirmed' where id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteOrder(int id) {
         try {
            PreparedStatement ps = connection.prepareStatement("delete from orders where id=?");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
