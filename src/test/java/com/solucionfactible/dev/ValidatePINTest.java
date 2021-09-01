package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidatePINTest {

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
	public void validPins() {
		assertEquals(true, ValidatePIN.isValid("1234"));
        assertEquals(true, ValidatePIN.isValid("0000"));
        assertEquals(true, ValidatePIN.isValid("1111"));
        assertEquals(true, ValidatePIN.isValid("098765"));
        assertEquals(true, ValidatePIN.isValid("000000"));
        assertEquals(true, ValidatePIN.isValid("090909"));
	}
	
	@Test
	public void nonDigitCharacters() {
		assertEquals(false, ValidatePIN.isValid("123a"));
		assertEquals(false, ValidatePIN.isValid("987."));
		assertEquals(false, ValidatePIN.isValid("4521(("));
		assertEquals(false, ValidatePIN.isValid("..1234#!"));
	}
	
	@Test
	public void invalidLengths() {
		assertEquals(false, ValidatePIN.isValid("0"));
		assertEquals(false, ValidatePIN.isValid("98"));
		assertEquals(false, ValidatePIN.isValid("123"));
		assertEquals(false, ValidatePIN.isValid("98745"));
		assertEquals(false, ValidatePIN.isValid("9876543"));
		assertEquals(false, ValidatePIN.isValid("-4567"));
		assertEquals(false, ValidatePIN.isValid("1.241"));
		assertEquals(false, ValidatePIN.isValid("00000000"));
		assertEquals(false, ValidatePIN.isValid("12 34"));
		assertEquals(false, ValidatePIN.isValid("0"));
		assertEquals(false, ValidatePIN.isValid(" 1234 "));
		assertEquals(false, ValidatePIN.isValid("98  76"));
		assertEquals(false, ValidatePIN.isValid(" 1111"));
	}

    /**
     * Test of isValid method, of class ValidatePIN.
     */
    @org.junit.Test
    public void testIsValid() {
        System.out.println("isValid");
        String pin = "";
        boolean expResult = false;
        boolean result = ValidatePIN.isValid(pin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
