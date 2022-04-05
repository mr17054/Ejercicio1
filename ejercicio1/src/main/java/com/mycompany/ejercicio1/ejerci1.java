/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Menendez
 */
public class ejerci1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String nom,Ape,em,dir,pob,sex;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejerci1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ejerci1 at " + request.getContextPath() + "</h1>");
            nom=request.getParameter("nombre");
            
            
            Ape=request.getParameter("Apellidos");
            
            
           em=request.getParameter("email");
           
           
           
            dir=request.getParameter("direccion");
            
            
         pob=request.getParameter("poblacion");
           sex=request.getParameter("sexo");
          
           
             out.println("A CONTINUACION LE MOSTRAMOS LA INFORMACION");
               out.println("<h2> Bienvenido@s</h2>");

                      out.println("<h2>" + nom + Ape + "<h2>");
                                   out.println( "<h2>"+"Su email es: " + em +"<h2>");
                                                out.println("<h2>"+"La Direccion proporcionada es: "+dir+ "<h2>");
                                                             out.println("<h2>"+"Su Lugar de residencia es: "+pob+"<h2>");
                                                                          out.println("<h2>"+"Sexo: "+sex+"<h2>");
                                                                          
                                                                          
                                                                          
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
        processRequest(request, response);
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
        processRequest(request, response);
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
