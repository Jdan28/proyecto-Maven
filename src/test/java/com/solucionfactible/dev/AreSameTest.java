package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreSameTest {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

	@Test
	public void validTest() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(true, AreSame.comp(a, b)); 
	}
	
	@Test
	public void invalidTest() {
		int[] a = new int[]{21, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(false, AreSame.comp(a, b)); 
	}	

    /**
     * Test of comp method, of class AreSame.
     */
    @org.junit.Test
    public void testComp() {
        System.out.println("comp");
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        boolean expResult = false;
        boolean result = AreSame.comp(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
