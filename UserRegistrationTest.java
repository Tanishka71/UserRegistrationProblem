package com.bridgelabz.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	
 	UserRegistration user=new UserRegistration();
    @BeforeEach
    void setup() {
   
    }
	@Test
	void test() {
		
		assertEquals(true,user.isValidPassword("Tss88hudebh"),
				"checks for Password: ");
	}


}
