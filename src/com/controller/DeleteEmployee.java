package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeService;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/delete-employee")
public class DeleteEmployee extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EmployeeService contactService = new EmployeeService();
        contactService.deleteEmployee(request.getParameter("id"));
        RequestDispatcher rd = request.getRequestDispatcher("home");
        rd.forward(request, response);

    }

}
