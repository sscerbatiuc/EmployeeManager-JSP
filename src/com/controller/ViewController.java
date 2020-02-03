package com.controller;

import com.dao.EmployeeService;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "Controller allowing to view employees", urlPatterns = {"/view"})
public class ViewController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EmployeeService employeeService = new EmployeeService();
        HttpSession session = request.getSession();
        session.setAttribute("contactList", employeeService.getAll());
        response.sendRedirect("view.jsp");

    }

}
