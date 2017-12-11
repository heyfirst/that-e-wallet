/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlt.thatewallet.servlet.model;

import com.tlt.thatewallet.utils.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manasanan.Aom
 */
public class User {
    private  int userId ;
    private String name ;
    private String phoneNumber;
    private double uAmount ;

    public User() {
    }
    
    
    public User(ResultSet rs) throws SQLException {
        this.userId = rs.getInt("userId");
        this.name = rs.getString("name");
        this.phoneNumber = rs.getString("phonenumber");
        this.uAmount = rs.getDouble("uamont");
       
    }

      public static User findByPhonenumber(String param){
        User u = null; 
        Connection conn = ConnectionBuilder.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM user WHERE phonenumber like ?");
            pstm.setString(1,param);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){               
               u = new User (rs);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
     return u ;   
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getuAmount() {
        return uAmount;
    }

    public void setuAmount(double uAmount) {
        this.uAmount = uAmount;
    }
    
    
    
    
}
