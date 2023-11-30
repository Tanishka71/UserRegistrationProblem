package com.bridgelabz.user;

import java.util.regex.*;

public class UserRegistration {
	/*
	 * @desc:checks whether the first name is valid or not
	 * @params:string
	 * @return:none
	 */
	boolean validFirstName(String firstName) {
		String regex="^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		 return matcher.matches();
	}
}
