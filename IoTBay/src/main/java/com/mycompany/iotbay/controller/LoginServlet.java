/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.iotbay.controller;

import com.mycompany.iotbay.dao.AccessLogDao;
import com.mycompany.iotbay.dao.UserDao;
import com.mycompany.iotbay.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    UserDao userDao = new UserDao();
    AccessLogDao accessLogDao = new AccessLogDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = userDao.login(request.getParameter("username"), request.getParameter("password"));
        if (user != null) {
            request.getSession().setAttribute("currentUser", user);
            accessLogDao.insertLog(user.getId());
            System.out.println(user);
            response.sendRedirect("device");
        } else {
            response.sendRedirect("login.jsp");
        }

    }
}
