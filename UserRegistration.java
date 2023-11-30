package com.bridgelabz.user;

import java.util.regex.*;

public class UserRegistration {
	/*
	 * @desc:checks whether the first name is valid or not
	 * @params:string
	 * @return:none
	 */
	//USE CASE 1
	boolean validFirstName(String firstName) {
		String regex="^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		 return matcher.matches();
	}
	/*
	 * @desc:checks whether the last name is valid or not
	 * @params:string
	 * @return:none
	 */
	//USE CASE 2
	boolean validLastName(String lastName) {
		String regex="^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		 return matcher.matches();
	}
	
    /**
     * @desc:Validates the entered email based on specified criteria.
     * @param email The email to be validated.
     * @return true if the email is valid, false otherwise.
     */
	//USE CASE 3
    boolean isValidEmail(String email) {
        // Regular expression for a valid email
        String regex = "^[a-zA-Z0-9]+([._%+-]+[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(email);

        // Check if the email matches the pattern
        return matcher.matches();
    }

}
