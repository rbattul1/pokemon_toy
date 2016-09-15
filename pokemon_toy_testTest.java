/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon_toy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rama krishna
 */
public class pokemon_toy_testTest {
    
    public pokemon_toy_testTest() {
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
    public void testnum_poke1(){
     System.out.println("pokemon test1");
     int pik=1;
     int squ=0;
     int cha=0;
     Pokemon_toy  inst = new Pokemon_toy();
     double expres = 6;
     double res = inst.num_poke(pik,squ,cha);
     assertEquals(expres, res,cha);    
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testnum_poke2(){
     System.out.println("pokemon test2");
     int pik=2;
     int squ=0;
     int cha=0;
     Pokemon_toy  inst = new Pokemon_toy();
     double expres = 12;
     double res = inst.num_poke(pik,squ,cha);
     assertEquals(expres, res,cha);    
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testnum_poke3(){
     System.out.println("pokemon test3");
     int pik=1;
     int squ=1;
     int cha=0;
     Pokemon_toy  inst = new Pokemon_toy();
     double expres = 9.90;
     double res = inst.num_poke(pik,squ,cha);
     assertEquals(expres, res,cha);    
      
    }
    @Test
    public void testnum_poke4(){
     System.out.println("pokemon test4");
     int pik=2;
     int squ=2;
     int cha=0;
     Pokemon_toy  inst = new Pokemon_toy();
     double expres = 19.80;
     double res = inst.num_poke(pik,squ,cha);
     assertEquals(expres, res,cha);    
      
    }
@Test
    public void testnum_poke5(){
     System.out.println("pokemon test5");
     int pik=3;
     int squ=3;
     int cha=0;
     Pokemon_toy  inst = new Pokemon_toy();
     double expres = 29.70;
     double res = inst.num_poke(pik,squ,cha);
     assertEquals(expres, res,cha);    
      
    }
    @Test
    public void testnum_poke6(){
     System.out.println("pokemon test8");
     int pik=1;
     int squ=1;
     int cha=1;
     Pokemon_toy  inst = new Pokemon_toy();
     double expres = 12.80;
     double res = inst.num_poke(pik,squ,cha);
     assertEquals(expres, res,cha); 
    }
    
}
