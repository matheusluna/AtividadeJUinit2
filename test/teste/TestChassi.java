/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidades.Chassi;
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
public class TestChassi {
    
    public TestChassi() {
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
    public void test1(){
        assertEquals("2010", Chassi.verificaChassi("9bp17164ga0000001"));
    }
    
    @Test
    public void test2(){
        assertEquals("2011", Chassi.verificaChassi("9bp17164gB0000001"));
    }
    
    @Test
    public void test3(){
        assertEquals("2012", Chassi.verificaChassi("9bp17164gc0000001"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
