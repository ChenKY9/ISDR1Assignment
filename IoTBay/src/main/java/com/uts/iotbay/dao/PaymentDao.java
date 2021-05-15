/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.dao;

import com.uts.iotbay.model.AccessLog;
import com.uts.iotbay.model.Payment;
import com.uts.iotbay.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentDao extends BaseDao {

    public List<Payment> getPayments(Integer userId, String paymentId, String date) {
        List<Payment> list = new ArrayList();
        try {
            PreparedStatement ps;
            if (paymentId != null && !paymentId.isEmpty()) {
                ps = connection.prepareStatement("select * from payment where userid=? and id=?");
                ps.setInt(1, userId);
                ps.setInt(2, Integer.parseInt(paymentId));
            } else if(date != null && !date.isEmpty()) {
                ps = connection.prepareStatement("select * from payment where userid=? and pay_date>=? and pay_date <=?");
                ps.setInt(1, userId);
                ps.setString(2, date + " 00:00:00");
                ps.setString(3, date + " 23:59:59");
            } else {
                ps = connection.prepareStatement("select * from payment where userid=?");
                ps.setInt(1, userId);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Payment(rs.getInt("id"), rs.getInt("orderid"), rs.getInt("userid"), rs.getDouble("amount"), rs.getString("method"), rs.getString("card_number"), rs.getString("card_name"), rs.getString("cvv"), rs.getString("status"), rs.getDate("pay_date").toString()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaymentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void createPayment(Payment payment) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into payment(orderid, userid, amount, method, card_number, card_name, cvv) values(?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, payment.getOrderId());
            ps.setInt(2, payment.getUserId());
            ps.setDouble(3, payment.getAmount());
            ps.setString(4, payment.getMethod());
            ps.setString(5, payment.getCardNumber());
            ps.setString(6, payment.getCardName());
            ps.setString(7, payment.getCvv());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatePayment(Payment payment) {
        try {
            PreparedStatement ps = connection.prepareStatement("update payment set method=?, card_number=?, card_name=?, cvv=? where id=?");
            ps.setString(1, payment.getMethod());
            ps.setString(2, payment.getCardNumber());
            ps.setString(3, payment.getCardName());
            ps.setString(4, payment.getCvv());
            ps.setInt(5, payment.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Payment getPaymentById(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("select * from payment where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return new Payment(rs.getInt("id"), rs.getInt("orderId"), rs.getInt("userId"), rs.getDouble("amount"), rs.getString("method"), rs.getString("card_number"), rs.getString("card_name"), rs.getString("cvv"), rs.getString("status"), rs.getDate("pay_date").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void confirmPaymentById(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("update payment set status='Confirmed' where id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePaymentById(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("delete from payment where id=?");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
