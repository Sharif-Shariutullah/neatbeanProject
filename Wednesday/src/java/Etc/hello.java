/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.jni.Address;

/**
 *
 * @author B-5
 */
@WebServlet("/")
public class hello extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hello</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Sharif  >>>  hello at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//                System.out.println("------doGet----");

        RequestDispatcher dispather = request.getRequestDispatcher("form.jsp");
        dispather.forward(request, response);

//        processRequest(request, response);
    }

    
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("------doPost----");
        System.out.println("\n");
        
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String dob = request.getParameter("dob");
        String subject = request.getParameter("subject");
        
        System.out.println( "Name: " + name +  "\n" + "Address:  " + address + "\n" + "Date of Birth: "+ dob + "\n" + " Subject: "+ subject);
       
        
        
        request.setAttribute("name", name);
        request.setAttribute("address", "TCL ");
        request.setAttribute("dob", dob);
        request.setAttribute("subject", subject);
        
        
         RequestDispatcher dispather = request.getRequestDispatcher("value.jsp");
        dispather.forward(request, response);
//        processRequest(request, response);
    }

    
    
    
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
    
    
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
