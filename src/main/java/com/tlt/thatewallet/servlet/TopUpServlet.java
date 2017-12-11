/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlt.thatewallet.servlet;

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
        User user = new User(phoneNumber);
        if (user == null) {
            // Render Error
            return;
        }
        
        
        // Check Can Topup
        
        Double newBalance = user.getBalance() + topup;
        if (newBalance <= 5000) {
            // Render Confirm
            // Render JSP
            getServletContext()
                .getRequestDispatcher("/confirm.jsp")
                .forward(request, response);
        } else {
            // Render Error
            return;
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
