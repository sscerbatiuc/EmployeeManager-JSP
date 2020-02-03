package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeService;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet(urlPatterns = "/add-employee")
public class AddEmployee extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("add.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phoneno = request.getParameter("phoneno");
        EmployeeService contactService = new EmployeeService();
        contactService.add(name, address, phoneno);
//        HttpSession session = request.getSession();
//        session.setAttribute("contactList", contactService.getAllContacts());
        response.sendRedirect("index.jsp");

    }

}
