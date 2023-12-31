package com.bridgelabz.user;

import java.util.regex.*;

public class UserRegistration {
	/*
	 * @desc:checks whether the first name is valid or not
	 * @params:string
	 * @return:none
	 */
	//USE CASE 1
	boolean isvalidFirstName(String firstName) {
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
	boolean isvalidLastName(String lastName) {
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
        String regex = "^[a-zA-Z0-9]+([._%+-]+[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    /**
     * @desc:Validates the entered email based on specified criteria.
     * @param THE phone number to be validated.
     * @return true if the email is valid, false otherwise.
     */
	//USE CASE 4
    boolean isValidPhoneNo(String phoneNo) {
        String regex = "^\\d{2} \\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);
        return matcher.matches();
    }
    
    /**
     * @desc:Validates the entered email based on specified criteria.
     * @param THE phone number to be validated.
     * @return true if the email is valid, false otherwise.
     */
	//USE CASE 8 rule 4 
    boolean isValidPassword(String password) {
    	 String combinedRules = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$";
        Pattern pattern = Pattern.compile(combinedRules);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
