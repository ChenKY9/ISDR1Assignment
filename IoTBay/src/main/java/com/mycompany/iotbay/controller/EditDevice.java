/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.iotbay.controller;

import com.mycompany.iotbay.dao.AccessLogDao;
import com.mycompany.iotbay.dao.DeviceDao;
import com.mycompany.iotbay.dao.UserDao;
import com.mycompany.iotbay.model.Device;
import com.mycompany.iotbay.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editDevice")
public class EditDevice extends HttpServlet {

    DeviceDao deviceDao = new DeviceDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Device device = deviceDao.findDeviceById(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("device",device );
        request.getRequestDispatcher("editDevice.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        deviceDao.updateDevice(Integer.parseInt(request.getParameter("id")),request.getParameter("name"), request.getParameter("type"),Double.parseDouble(request.getParameter("price")),Integer.parseInt(request.getParameter("stock")));
        response.sendRedirect("device");
//        if (user != null) {
//            request.getSession().setAttribute("currentUser", user);
//            accessLogDao.insertLog(user.getId());
//            System.out.println(user);
//            response.sendRedirect("index.jsp");
//        } else {
//            response.sendRedirect("login.jsp");
//        }

    }
}
