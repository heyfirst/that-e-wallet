/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlt.thatewallet.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KS
 */
public class ConnectionBuilder {
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/Classroom","root","root");
           
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException except) {
            except.printStackTrace();
        }

        return conn;
    }
}
