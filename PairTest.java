/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hp
 */
public class PairTest {
    
    public PairTest() {
    }

   
    /**
     * Test of getWord method, of class Pair.
     */
    @Test
    public void testGetWord() {
        Pair pair=new Pair("Abc",3);
        assertEquals(pair.getWord(),"Abc");
    }

    /**
     * Test of getCount method, of class Pair.
     */
    @Test
    public void testGetCount() {
        Pair pair=new Pair("Abc",3);
        assertEquals(pair.getCount(),3);
    }
    
}
