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
	
	boolean validLastName(String lastName) {
		String regex="^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		 return matcher.matches();
	}
	
}
