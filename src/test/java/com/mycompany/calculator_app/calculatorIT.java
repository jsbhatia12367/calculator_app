/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator_app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jagmeet
 */
public class calculatorIT {
    
    public calculatorIT() {
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
     * Test of enable method, of class calculator.
     */
    @Test
    public void testEnable() {
        /*System.out.println("enable");
        calculator instance = new calculator();
        instance.enable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of disable method, of class calculator.
     */
    @Test
    public void testDisable() {
       /* System.out.println("disable");
        calculator instance = new calculator();
        instance.disable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of fun method, of class calculator.
     */
    @Test
    public void testFun() {
        
        
        //System.out.println("fun");
      /*  double d1 = 0.0;
        double d2 = 0.0;
        calculator instance = new calculator();
        String expResult = "";
        String result = instance.fun(d1, d2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");*/
    }

    /**
     * Test of main method, of class calculator.
     */
    @Test
    public void testMain() {
        /*System.out.println("main");
        String[] args = null;
        calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
    /*public void call(char c) {
        java.awt.event.ActionEvent evt;
         calculator instance = new calculator();
        switch(c)
        {
                case '+':
                instance.additionActionPerformedCall();
                break;
                case '-':
                instance.additionActionPerformedCall();
                break;
                //break;
                case '*':
                instance.additionActionPerformedCall();
                break;
                //break;
                case '/':
                instance.additionActionPerformedCall();
                break;
                //break;
                case '%':
                instance.additionActionPerformedCall();
                break;
                //break;
                case '=':
                instance.equalActionPerformedCall();
                break;
                case 'b':
                instance.additionActionPerformedCall();
                break;
                case 'm':
                instance.additionActionPerformedCall();
                break;
                case 'c':
                instance.additionActionPerformedCall();
                break;
                case '1':
                instance.additionActionPerformedCall();
                break;
                case '2':
                instance.jButton2ActionPerformedCall();
                break;
                case '3':
                instance.jButton3ActionPerformedCall();
                break;
                case '4':
                instance.additionActionPerformedCall();
                break;
                case '5':
                instance.additionActionPerformedCall();
                break;
                case '6':
                instance.additionActionPerformedCall();
                break;
                case '7':
                instance.additionActionPerformedCall();
                break;
                case '8':
                instance.additionActionPerformedCall();
                break;
                case '9':
                instance.additionActionPerformedCall();
                break;
                case '0':
                instance.additionActionPerformedCall();
                break;
        }
    }
    */
    @Test
    public void testExpression() {
        calculator instance = new calculator();
        String exp = "2+3=*6.0b2=";
        /*for(int i=0;i<exp.length();i++)
        {
          call(exp.charAt(i));  
        }*/
        instance.call(exp);
        Double expected = 31.0;
        Double actual = 0.0;
        //System.out.println(instance.getTextField1()+"check");
        //actual = instance.getTextField1();
        actual = Double.parseDouble(instance.getAnswer());//instance.getAnswer();
        assertEquals(expected , actual);
    }
    @Test
    public void testExpression2() {
        calculator instance = new calculator();
        String exp = "2+3=*6.0b2=c2+3=*6.0b2=bbb*2=";
        /*for(int i=0;i<exp.length();i++)
        {
          call(exp.charAt(i));  
        }*/
        instance.call(exp);
        Double expected = 6.0;
        Double actual = 0.0;
        //System.out.println(instance.getTextField1()+"check");
        //actual = instance.getTextField1();
        actual = Double.parseDouble(instance.getAnswer());//instance.getAnswer();
        assertEquals(expected , actual);
    }
    
}
