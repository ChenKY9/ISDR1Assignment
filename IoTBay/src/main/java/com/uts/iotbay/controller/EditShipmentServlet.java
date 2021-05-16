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
import com.uts.iotbay.model.Shipment;
import com.uts.iotbay.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editShipment")
public class EditShipmentServlet extends HttpServlet {

    ShipmentDao shipmentDao = new ShipmentDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("shipment", shipmentDao.findShipmentById(Integer.parseInt(request.getParameter("id"))));
        request.getRequestDispatcher("editShipment.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("currentUser");
        System.out.println(Integer.parseInt(request.getParameter("id"))+"  "+Integer.parseInt(request.getParameter("orderId"))+request.getParameter("receiverName")+request.getParameter("shipmentAddress")+request.getParameter("receiverPhone"));
        Shipment shipment = new Shipment(
                Integer.parseInt(request.getParameter("id")), 
                Integer.parseInt(request.getParameter("orderId")), 
                request.getParameter("receiverName"),
                request.getParameter("shipmentAddress"),
                request.getParameter("receiverPhone")
        );
        shipmentDao.updateShipment(shipment);
        System.out.println("update");
        response.sendRedirect("shipments");
    }
}
