/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.servlet;

import com.test.model.Student;
import com.test.model.SubjectEnum;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author B-4
 */
@WebServlet("/")
public class Main extends HttpServlet {

    List< Student> students = new ArrayList<Student>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getServletPath();
        System.out.println("goGet----" + action);

        if (action.equals("/")) {

            viewForm(request, response);

        } else if (action.equals("/list")) {

            listUser(request, response);

        } else if (action.equals("/add")) {

            addData(request, response);

        } else if (action.equals("/view")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void viewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("add_form.jsp");
        dispatcher.forward(request, response);
    }

    private void addData(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String dob = request.getParameter("dob");
        String subject = request.getParameter("subject");
        Student newUser = new Student((long) students.size(), name, address, LocalDate.now(), SubjectEnum.JAVA);
        students.add(newUser);

        request.setAttribute("list", students);

        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        request.setAttribute("list", students);

        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);

    }

//    
//    
//    
//
//    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("add.jsp");
//        dispatcher.forward(request, response);
//    }
//
//    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, ServletException, IOException {
//        Long id = Long.parseLong(request.getParameter("id"));
//        Student existingUser = userDAO.getStudentByID(id);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
//        request.setAttribute("user", existingUser);
//        dispatcher.forward(request, response);
//
//    }
//
//    private void insertUser(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException {
//        String name = request.getParameter("name");
//        String address = request.getParameter("address");
//        String dob = request.getParameter("dob");
//        String subject = request.getParameter("subject");
//
//        Student newUser = new Student(name, address, LocalDate.now(), SubjectEnum.JAVA);
//        userDAO.addStudent(newUser);
//        response.sendRedirect("list");
//    }
//
//    private void updateUser(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException {
//        Long id = Long.parseLong(request.getParameter("id"));
//        String name = request.getParameter("name");
//        String address = request.getParameter("address");
//        String dob = request.getParameter("dob");
//        String subject = request.getParameter("subject");
//
//        Student newUser = new Student(id, name, address, LocalDate.now(), SubjectEnum.JAVA);
//        userDAO.updateStudent(newUser, id);
//        response.sendRedirect("list");
//    }
//
//    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException {
//        Long id = Long.parseLong(request.getParameter("id"));
//        userDAO.deleteStudent(id);
//        response.sendRedirect("list");
//
//    }
}
