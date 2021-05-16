/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.iotbay.controller;

import com.uts.iotbay.dao.AccessLogDao;
import com.uts.iotbay.dao.PaymentDao;
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

@WebServlet("/addPayment")
public class AddPaymentServlet extends HttpServlet {

    PaymentDao paymentDao = new PaymentDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("orderId", request.getParameter("orderId") == null ? "100001" : request.getParameter("orderId"));
        request.setAttribute("amount", request.getParameter("amount") == null ? "99.8" : request.getParameter("amount"));
        request.getRequestDispatcher("addPayment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("currentUser");
        Payment payment = new Payment(
                Integer.parseInt(request.getParameter("orderId")),
                user.getId(),
                Double.parseDouble(request.getParameter("amount")),
                request.getParameter("method"),
                request.getParameter("cardNumber"),
                request.getParameter("cardName"),
                request.getParameter("cvv")
        );
        paymentDao.createPayment(payment);
        response.sendRedirect("payments");
    }
}
