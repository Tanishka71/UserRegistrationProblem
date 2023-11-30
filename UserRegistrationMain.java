package com.bridgelabz.user;
import java.util.Scanner;

public class UserRegistrationMain {
//desc:main function
	   public static void main(String[] args) {
		   UserRegistration user=new UserRegistration();
	   
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your first name: ");
	        String firstName = scanner.nextLine();
	        if (user.validFirstName(firstName)) {
	            System.out.println("Valid first name: " + firstName);
	        } else {
	            System.out.println("Invalid first name. Please follow the specified format.");
	        }

	        scanner.close();
}
}
