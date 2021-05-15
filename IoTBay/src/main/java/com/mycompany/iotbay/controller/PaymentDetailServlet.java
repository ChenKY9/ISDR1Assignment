/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.iotbay.controller;

import com.mycompany.iotbay.dao.AccessLogDao;
import com.mycompany.iotbay.dao.PaymentDao;
import com.mycompany.iotbay.dao.UserDao;
import com.mycompany.iotbay.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/paymentDetail")
public class PaymentDetailServlet extends HttpServlet {

    PaymentDao paymentDao = new PaymentDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("payment", paymentDao.getPaymentById(Integer.parseInt(request.getParameter("id"))));
        request.getRequestDispatcher("paymentDetail.jsp").forward(request, response);
    }
}
