package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EmployeeService;

@WebServlet("/update-employee")
public class UpdateEmployee extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeeService contactService = new EmployeeService();
        HttpSession session = request.getSession();
        session.setAttribute("contactById", contactService.getById(request.getParameter("id")));
        response.sendRedirect("update.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeeService contactService = new EmployeeService();
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phoneno = request.getParameter("phoneno");
        contactService.update(id, name, address, phoneno);
        response.sendRedirect("index.jsp");
    }

}
