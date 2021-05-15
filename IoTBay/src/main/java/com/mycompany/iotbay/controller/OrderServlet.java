/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.iotbay.controller;

import com.mycompany.iotbay.dao.AccessLogDao;
import com.mycompany.iotbay.dao.DeviceDao;
import com.mycompany.iotbay.dao.OrderDao;
import com.mycompany.iotbay.dao.UserDao;
import com.mycompany.iotbay.model.Device;
import com.mycompany.iotbay.model.Order;
import com.mycompany.iotbay.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

    OrderDao orderdao = new OrderDao();
    DeviceDao deviceDao = new DeviceDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Device device = deviceDao.findDeviceById(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("device",device );
        request.getRequestDispatcher("orderDevice.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("11111111111");
        User user = (User) request.getSession().getAttribute("currentUser");
        Order order = new Order(
                Integer.parseInt(request.getParameter("deviceId")),
                request.getParameter("deviceName"),
                Double.parseDouble(request.getParameter("price")),
                Integer.parseInt(request.getParameter("quantity")),
                request.getParameter("name"),
                request.getParameter("address"),
                request.getParameter("phone"),
                user.getId(),
                "Pending"
        );
        orderdao.createOrder(order);
        response.sendRedirect("orderList");

    }
}
