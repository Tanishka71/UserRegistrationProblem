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

	        scanner.close();
}
}
