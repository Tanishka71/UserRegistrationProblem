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
		
		assertEquals(true,user.validLastName("Jain"),
				"checks for valid name: ");
	}


}
