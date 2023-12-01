package com.bridgelabz.user;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	
 	UserRegistration user=new UserRegistration();
 	
 	
	/*
	 * @desc:tests for all the true values
	 * @params:none
	 * @return:none
	 */
	@Test
	void happyTestForUser() {
		assertTrue(user.isvalidFirstName("Tanishka"));
		assertTrue(user.isvalidLastName("Jain"));
		assertTrue(user.isValidEmail("abcd.xyz@bl.co.in"));
		assertTrue(user.isValidPhoneNo("91 7394992239"));
		assertTrue(user.isValidPassword("Tani@1508"));
	}
	
	
	/*
	 * @desc:tests for all the false values
	 * @params:none
	 * @return:none
	 */
	@Test
	void sadTestForUser() {
		assertFalse(user.isvalidFirstName("hajaja"));
		assertFalse(user.isvalidLastName("haja"));
		assertFalse(user.isValidEmail("abccom"));
		assertFalse(user.isValidPhoneNo("1234890"));
		assertFalse(user.isValidPassword("d1234"));
	
	}


}
