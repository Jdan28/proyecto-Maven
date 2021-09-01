package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

import static com.solucionfactible.dev.Persistence.persistence;;

public class PersistenceTest {

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
	public void tests() {
		assertEquals(3, persistence(39));
		assertEquals(0, persistence(4));
		assertEquals(4, persistence(999));
		assertEquals(1, persistence(10));
		assertEquals(2, persistence(25));
		assertEquals(3, persistence(39));
		assertEquals(4, persistence(77));
		assertEquals(5, persistence(679));
		assertEquals(6, persistence(6788));
		assertEquals(7, persistence(68889));
		assertEquals(8, persistence(2677889));
		assertEquals(9, persistence(26888999));
		assertEquals(10, persistence(3778888999l));
	}

    /**
     * Test of persistence method, of class Persistence.
     */
    @org.junit.Test
    public void testPersistence() {
        System.out.println("persistence");
        long num = 0L;
        int expResult = 0;
        int result = Persistence.persistence(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
