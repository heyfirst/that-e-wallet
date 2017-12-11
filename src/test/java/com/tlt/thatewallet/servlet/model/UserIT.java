/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlt.thatewallet.servlet.model;

import com.tlt.thatewallet.model.User;
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
        String expResult = "0948746165";
        User result = instance.findByPhonenumber(param);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getUserId method, of class User.
     */
    
}
