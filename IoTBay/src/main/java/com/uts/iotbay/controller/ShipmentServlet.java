/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.controller;

import com.uts.iotbay.dao.AccessLogDao;
import com.uts.iotbay.dao.DeviceDao;
import com.uts.iotbay.dao.OrderDao;
import com.uts.iotbay.dao.ShipmentDao;
import com.uts.iotbay.dao.UserDao;
import com.uts.iotbay.model.Device;
import com.uts.iotbay.model.Order;
import com.uts.iotbay.model.Shipment;
import com.uts.iotbay.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/shipments")
public class ShipmentServlet extends HttpServlet {
    ShipmentDao shipmentDao = new ShipmentDao();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        User user = (User) request.getSession().getAttribute("currentUser");
        request.setAttribute("list", shipmentDao.getShipments(user.getId(), request.getParameter("shipmentId"), request.getParameter("date")));
        request.getRequestDispatcher("shipments.jsp").forward(request, response);
    }

    
}
