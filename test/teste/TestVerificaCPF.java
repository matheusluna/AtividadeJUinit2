/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidades.CPF;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class TestVerificaCPF {
    
    public TestVerificaCPF() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
   @Test
    public void test1(){
        assertTrue(CPF.verificaCPF("112.815.124-35"));
    }
    
    @Test
    public void test2(){
        assertTrue(CPF.verificaCPF("133.731.384-00"));
    }
    
    @Test
    public void test3(){
        assertFalse(CPF.verificaCPF("333.124.987-55"));
    }
}
