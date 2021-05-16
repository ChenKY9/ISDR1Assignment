/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.dao;

import com.uts.iotbay.model.AccessLog;
import com.uts.iotbay.model.Device;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeviceDao extends BaseDao {

    public void createdevice(String name,String type, Double price, int stock) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into device(name, type, price, stock) values(?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, type);
            ps.setDouble(3, price);
            ps.setInt(4, stock);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateDevice(int id, String name, String type, Double price, int stock){
        try {
            PreparedStatement ps = connection.prepareStatement("update device set name=?, type=?, price=?, stock=? where id=?");
            ps.setString(1, name);
            ps.setString(2, type);
            ps.setDouble(3, price);
            ps.setInt(4, stock);
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void deleteDeviceById(int id){
    try {
            PreparedStatement ps = connection.prepareStatement("delete from device where id=?");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public List<Device> getDivce(String name, String type) {
        List<Device> deviceList = new ArrayList();
            PreparedStatement ps;
        try {
            String sql = "select * from device where id is not null";
            if(name!=null && !name.isEmpty()){
               sql += " and name='"+name+"'";
            }
            if(type!=null && !type.isEmpty()){
                 sql += " and type='"+type+"'";
            }
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                deviceList.add(new Device(rs.getInt("id"),rs.getString("name"), rs.getString("type"), rs.getDouble("price"), rs.getInt("stock")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(deviceList.size());
        return deviceList;
    }
    
    public Device findDeviceById(int id){
         try {
            PreparedStatement ps = connection.prepareStatement("select * from device where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Device device = new Device(rs.getInt("id"),rs.getString("name"), rs.getString("type"), rs.getDouble("price"), rs.getInt("stock"));
                return device;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeviceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
    }
    
    
}
