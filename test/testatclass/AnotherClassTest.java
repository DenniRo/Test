/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatclass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dennis
 */
public class AnotherClassTest {
    
    public AnotherClassTest() {
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
     * Test of divide method, of class AnotherClass.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double x = 4;
        double y = 4;
        AnotherClass instance = new AnotherClass();
        double expResult = 1;
        double result = instance.divide(x, y);
        assertEquals(expResult, result);
       // double expResult2 = 1;
        //double result2 = instance.divide(x, y);
        //assertEquals(expResult, result2);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
