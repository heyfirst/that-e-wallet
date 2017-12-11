/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlt.thatewallet.servlet.model;

import com.tlt.thatewallet.model.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manasanan.Aom
 */
public class UserIT {
    
    public UserIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findByPhonenumber method, of class User.
     */
    @Test
    public void testFindByPhonenumber() {
        System.out.println("findByPhonenumber");
        String param = "0948746165";
        User instance = new User();
        instance.setName("Aom");
        instance.setPhoneNumber("0948746165");
        instance.setUserId(1001);
        instance.setuAmount(20.00);
        User expResult = instance;
        User result = instance.findByPhonenumber(param);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
//    @Test
//    public void testUpdateNewAmount()  {
//       
//        User instance = new User();
//        User beforeUser = instance.findByPhonenumber("0948746165");
//        
//        try {
//            instance.updateNewAmount(20, "0948746165");
//        } catch (SQLException ex) {
//           fail();
//        }
//        
//        User after = instance.findByPhonenumber("0948746165");
//        
//        assertEquals(20,after.getuAmount()-beforeUser.getuAmount());
//        
//        
//    }
    

    /**
     * Test of getUserId method, of class User.
     */
    
}
