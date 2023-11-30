package com.bridgelabz.user;
import java.util.Scanner;

public class UserRegistrationMain {
//desc:main function
	   public static void main(String[] args) {
		   UserRegistration user=new UserRegistration();
	   
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your email: ");
	        String email = scanner.nextLine();
	        if (user.isValidEmail(email)) {
	            System.out.println("Valid email: " + email);
	        } else {
	            System.out.println("Invalid email. Please follow the specified format.");
	        }

	        scanner.close();
}
}
