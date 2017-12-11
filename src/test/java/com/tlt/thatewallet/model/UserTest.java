/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tlt.thatewallet.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KS
 */
public class UserTest {
    
    public UserTest() {
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
    
    @Test
    public void testFindByPhonenumber() {
        System.out.println("findByPhonenumber");
        
        User instance = new User();
        instance.setName("Aom");
        instance.setPhoneNumber("0948746165");
        instance.setUserId(1001);
        instance.setuAmount(10.00);
        User expResult = instance;
        
        String param = "0948746165";
        User result = instance.findByPhonenumber(param);
        
        assertEquals(expResult, result);
    }
}
