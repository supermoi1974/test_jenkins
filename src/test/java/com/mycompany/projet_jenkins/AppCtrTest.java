/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.projet_jenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sfafa
 */
public class AppCtrTest {

    public AppCtrTest() {
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
     * Test of additionner method, of class AppCtr.
     */
    @Test
    public void testAdditionner1() {
        System.out.println("Test Additionner positif ");
        int valeur1 = 5;
        int valeur2 = 2;

        int expectedSersult = 7;

        int realResult = AppCtr.additionner(valeur1, valeur2);

        assertEquals(expectedSersult, realResult);
    }

}
