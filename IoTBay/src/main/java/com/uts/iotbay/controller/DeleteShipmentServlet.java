/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.controller;

import com.uts.iotbay.dao.AccessLogDao;
import com.uts.iotbay.dao.PaymentDao;
import com.uts.iotbay.dao.ShipmentDao;
import com.uts.iotbay.dao.UserDao;
import com.uts.iotbay.model.Payment;
import com.uts.iotbay.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteShipment")
public class DeleteShipmentServlet extends HttpServlet {

    ShipmentDao shipmentDao = new ShipmentDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        shipmentDao.deleteShipmentById(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("shipments");
    }
}
