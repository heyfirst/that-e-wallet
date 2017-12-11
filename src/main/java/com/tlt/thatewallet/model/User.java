/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlt.thatewallet.model;

import com.tlt.thatewallet.utils.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Manasanan.Aom
 */
public class User {
    private  int userId ;
    private String name ;
    private String phoneNumber;
    private double uAmount ;
    private double newAmount;
    private double userAmount;
    
    public User() {
    }
    
   
    
    
    public User(ResultSet rs) throws SQLException {
        this.userId = rs.getInt("userId");
        this.name = rs.getString("name");
        this.phoneNumber = rs.getString("phonenumber");
        this.uAmount = rs.getDouble("uamont");
       
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

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", uAmount=" + uAmount + '}';
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
    
    public void updateNewAmount(double amount,String pN) throws SQLException{
        
        userAmount = this.getuAmount();
        newAmount = amount+userAmount; 
        
        Statement statement = null;
        try {
            String sql = "UPDATE user SET uamont = "+newAmount+" where phoneNumber = "+pN;
            Connection conn = ConnectionBuilder.getConnection();
            statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    
}
