/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.dao;

import com.uts.iotbay.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao extends BaseDao {
    public User login(String username, String password){
        try {
            PreparedStatement ps = connection.prepareStatement("select * from users where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            User user = null;
            while(rs.next()){
                return new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getString("phone"), rs.getString("role"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void createUser(User user) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into users(username, password, email, phone, role) values(?, ?, ?, ?, ?)");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getRole());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void deleteUser(int userId) {
        try {
            PreparedStatement ps = connection.prepareStatement("delete from users where id=?");
            ps.setInt(1, userId);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void udpdateUser(User user) {
         try {
            PreparedStatement ps = connection.prepareStatement("update users set username=?, password=?, email=?, phone=?, role=? where id=?");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getRole());
            ps.setInt(6, user.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
