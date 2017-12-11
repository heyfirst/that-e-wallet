/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlt.thatewallet.servlet;

import com.tlt.thatewallet.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KS
 */
public class TopUpServlet extends HttpServlet {

<<<<<<< HEAD
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
        getServletContext().getRequestDispatcher("/topup.jsp").forward(request, response);
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
>>>>>>> 12f83d83ca3646f4977be27bff77db30b0675187
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        
        // Render JSP
        getServletContext()
                .getRequestDispatcher("/topup.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get Parameter from POST Request
        String topup = request.getParameter("topup");
        String phoneNumber = request.getParameter("phoneNumber");
        
        // Check Existing User
        User user = User.findByPhonenumber(phoneNumber);
        if (user == null) {
            // Render Error
//            getServletContext()
//                .getRequestDispatcher("/failuser.jsp")
//                .forward(request, response);  
            System.out.println("Not User");
            return;
        }
        
        
        // Check Can Topup
        
        Double newBalance = user.getuAmount() + Double.parseDouble(topup);
        if (newBalance <= 5000) {
            // Render Confirm
            // Render JSP
            System.out.println(newBalance);
//            getServletContext()
//                .getRequestDispatcher("/confirm.jsp")
//                .forward(request, response);
            System.out.println("Comfirming");
            return;
        } else {
            // Render Error
//            getServletContext()
//                .getRequestDispatcher("/overamount.jsp")
//                .forward(request, response);
//           }
            System.out.println("Can not TopUp");
            return;
        }
    }
}
