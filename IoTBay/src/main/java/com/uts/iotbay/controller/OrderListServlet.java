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

@WebServlet("/orderList")
public class OrderListServlet extends HttpServlet {

    OrderDao orderdao = new OrderDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("currentUser");
        List<Order> orderList = orderdao.allOrders(user.getId());
        request.setAttribute("orderList", orderList);
        request.getRequestDispatcher("orderList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}
