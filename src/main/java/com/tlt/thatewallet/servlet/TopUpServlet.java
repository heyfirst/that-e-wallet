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
            getServletContext()
                .getRequestDispatcher("/unknownuser.jsp")
                .forward(request, response);  
            System.out.println("Not User");
            return;
        }
        
        
        // Check Can Topup
        
        Double newBalance = user.getuAmount() + Double.parseDouble(topup);
        if (newBalance <= 5000) {
            // Render Confirm
            // Render JSP
            System.out.println(newBalance);
            
            request.setAttribute("user", user);
            request.setAttribute("topup", Double.parseDouble(topup));
            
            getServletContext()
                .getRequestDispatcher("/confirmtopup.jsp")
                .forward(request, response);
            System.out.println("Comfirming");
            return;
        } else {
            // Render Error
            request.setAttribute("user", user);
            
            getServletContext()
                .getRequestDispatcher("/failedtopup.jsp")
                .forward(request, response);
            System.out.println("Can not TopUp");
            return;
        }
    }
    
}
