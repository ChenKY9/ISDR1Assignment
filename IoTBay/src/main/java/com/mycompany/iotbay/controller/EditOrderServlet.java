/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.iotbay.controller;

import com.mycompany.iotbay.dao.AccessLogDao;
import com.mycompany.iotbay.dao.OrderDao;
import com.mycompany.iotbay.dao.PaymentDao;
import com.mycompany.iotbay.dao.UserDao;
import com.mycompany.iotbay.model.Order;
import com.mycompany.iotbay.model.Payment;
import com.mycompany.iotbay.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editOrder")
public class EditOrderServlet extends HttpServlet {

    OrderDao orderDao = new OrderDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("order", orderDao.findOrderById(Integer.parseInt(request.getParameter("id"))));
        request.getRequestDispatcher("editOrder.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("currentUser");
        System.out.println("in edit==================");
        Order order = new Order(
                Integer.parseInt(request.getParameter("id")),
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
        orderDao.updateOrder(order);
        response.sendRedirect("orderList");
    }
}
