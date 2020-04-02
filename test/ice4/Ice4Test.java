/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author root
 */
public class Ice4Test {
    
    public Ice4Test() {
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
     * Test of checkforchar method, of class Ice4.
     */
    @Test
    public void testCheckforchar() {
        System.out.println("checkforchar");
        String w = "bro";
        //String w= "atlas"//bad testing
        Ice4.checkforchar(w);
    }

    /**
     * Test of compares method, of class Ice4.
     */
    @Test
    public void testCompares() {
        System.out.println("compares");
        Ice4.compares();
    }

    /**
     * Test of checkword method, of class Ice4.
     */
    @Test
    public void testCheckword() {
        System.out.println("checkword");
        String sen = "I am a boy";
        String word = "boy"; //good testing
        //String word= "BOY"//bad testing
        Ice4.checkword(sen, word);
    }
    
}
