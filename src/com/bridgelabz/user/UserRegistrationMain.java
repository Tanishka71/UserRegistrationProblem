package com.bridgelabz.user;
import java.util.Scanner;

public class UserRegistrationMain {
//desc:main function
	   public static void main(String[] args) {
		   UserRegistration user=new UserRegistration();
	   
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your password: ");
	        String password = scanner.nextLine();
	        if (user.isValidPassword(password)) {
	            System.out.println("Valid password: " + password);
	        } else {
	            System.out.println("Invalid password. Please follow the specified format.");
	        }
	        

	        String[] emails = {
	                "abc@yahoo.com",
	                "abc-100@yahoo.com",
	                "abc.100@yahoo.com",
	                "abc111@abc.com",
	                "abc-100@abc.net",
	                "abc.100@abc.com.au",
	                "abc@1.com",
	                "abc+100@gmail.com",
	                "abc",
	                "abc@.com.my",
	                "abc123@gmail.a",
	                "abc123@.com",
	                "abc123@.com.com",
	                ".abc@abc.com",
	                "abc()*@gmail.com",
	                "abc@%*.com",
	                "abc..2002@gmail.com",
	                "abc.@gmail.com",
	                "abc@abc@gmail.com",
	                "abc@gmail.com.1a",
	                "abc@gmail.com.aa.au"
	        };

	        for (String e : emails) {
	            System.out.println(e);
	            if (user.isValidEmail(e)) {
	                System.out.println("Valid Email-Id!");

	            } else {
	                System.out.println("Invalid Email-id. Please enter in a valid format!!");
	            }
	        }

	        scanner.close();
}
}
