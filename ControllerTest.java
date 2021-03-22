/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.File;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hp
 */
public class ControllerTest {
    
    public ControllerTest() {
    }

   
    /**
     * Test of readWord method, of class Controller.
     */
    @Test
    public void testReadWord() {
        Controller controller = new Controller();
        File file = new File("poem.txt");
        controller.readWord(file);

        for (int i = 1; i < controller.getSortedWords().size(); i++) {
            boolean condition = controller.getSortedWords().get(i - 1).getCount() >= controller.getSortedWords().get(i).getCount();
            assertTrue(condition);
        }
    }

    /**
     * Test of sort method, of class Controller.
     */
    @Test
    public void testSort() {
        Controller controller=new Controller();
        ArrayList<Pair> list=new ArrayList<>();
        list.add(new Pair("Abc",2));
        list.add(new Pair("Pqr",4));
        list.add(new Pair("Xyz",1));

        controller.sort(list);
        for (int i = 1; i < list.size(); i++) {
            boolean condition = list.get(i - 1).getCount() >= list.get(i).getCount();
            assertTrue(condition);
        }
    }
    
}
