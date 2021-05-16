/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.controller;

import com.uts.iotbay.dao.AccessLogDao;
import com.uts.iotbay.dao.DeviceDao;
import com.uts.iotbay.dao.OrderDao;
import com.uts.iotbay.dao.UserDao;
import com.uts.iotbay.model.Device;
import com.uts.iotbay.model.Order;
import com.uts.iotbay.model.User;
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
