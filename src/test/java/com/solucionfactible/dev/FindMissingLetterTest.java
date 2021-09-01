package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

import static com.solucionfactible.dev.FindMissingLetter.findMissingLetter;

public class FindMissingLetterTest {

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
	public void test() {
		assertEquals('e', findMissingLetter(new char[] { 'a','b','c','d','f' }));
		assertEquals('m', findMissingLetter(new char[] { 'k','l','n','o' }));
		assertEquals('w', findMissingLetter(new char[] { 'u','v','x' }));
        assertEquals('P', findMissingLetter(new char[] { 'O','Q','R','S' }));
        assertEquals('Y', findMissingLetter(new char[] { 'X','Z' }));
	}

    /**
     * Test of findMissingLetter method, of class FindMissingLetter.
     */
    @org.junit.Test
    public void testFindMissingLetter() {
        System.out.println("findMissingLetter");
        char[] array = null;
        char expResult = ' ';
        char result = FindMissingLetter.findMissingLetter(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
