/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidades.CifraCesar;
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
public class TestCifraCesar {
    
    public TestCifraCesar() {
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
        assertEquals("UDIDHO JXLPDUDHV VDNXUDL", CifraCesar.criptografa("Rafael Guimaraes Sakurai", 3));
    }
    
    @Test
    public void test2(){
        assertEquals("RAFAEL GUIMARAES SAKURAI", CifraCesar.descriptografa("UDIDHO JXLPDUDHV VDNXUDL", 3));
    }
    
    @Test
    public void test3(){
        assertEquals("PDWKHXV PRUHLUD OXQD", CifraCesar.criptografa("Matheus Moreira Luna", 3));
    }
    
    @Test
    public void test4(){
        assertEquals("MATHEUS MOREIRA LUNA", CifraCesar.descriptografa("PDWKHXV PRUHLUD OXQD", 3));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
