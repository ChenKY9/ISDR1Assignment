/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.dao;

import com.uts.iotbay.model.AccessLog;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccessLogDao extends BaseDao {

    public void insertLog(int userId) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into access_log(userid) values(?)");
            ps.setInt(1, userId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccessLogDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<AccessLog> getAccessLog(int userId, String date) {
        List<AccessLog> alist = new ArrayList();
        try {
            PreparedStatement ps;
            if (date == null || date.isEmpty()) {
                ps = connection.prepareStatement("select * from access_log where userid=?");
                ps.setInt(1, userId);
            } else {
                ps = connection.prepareStatement("select * from access_log where userid=? and access_time>=? and access_time <=?");
                ps.setInt(1, userId);
                ps.setString(2, date + " 00:00:00");
                ps.setString(3, date + " 23:59:59");
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alist.add(new AccessLog(rs.getInt("id"), rs.getInt("userid"), rs.getString("access_time").toString()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccessLogDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(alist.size());
        return alist;
    }
}
