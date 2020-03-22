/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Diego Alvarez
 */
public class BinaryTreeNGTest {
    
    public BinaryTreeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }


   

    /**
     * Test of addNodo method, of class BinaryTree.
     */
    @Test
    public void testAddNodo() {
        System.out.println("addNodo");
        String d = "woman";
        String nom = "mujer";
        BinaryTree instance = new BinaryTree();
        instance.addNodo(d, nom);
        // TODO review the generated test code and remove the default call to fail.
        if(d.equalsIgnoreCase(nom)){
            fail("The test case is a prototype.");
        }
        
    }

 
    /**
     * Test of buscar method, of class BinaryTree.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String d = "woman";
        BinaryTree instance = new BinaryTree();
        String expResult = "mujer";
        String result = instance.buscar(d);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
       if(d.equalsIgnoreCase(expResult)){
           fail("The test case is a prototype.");
       }

    }

    /**
     * Test of buscarNodo method, of class BinaryTree.
     */
    @Test
    public void testBuscarNodo() {
        System.out.println("buscarNodo");
        String d = "woman";
        Nodo aux = null;
        BinaryTree instance = new BinaryTree();
        String expResult = "mujer";
        String result = instance.buscarNodo(d, aux);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
       if(d.equalsIgnoreCase(expResult)){
           fail("The test case is a prototype.");
       }
    }
    
}
