package com.bridgelabz.user;
import java.util.Scanner;

public class UserRegistrationMain {
//desc:main function
	   public static void main(String[] args) {
		   UserRegistration user=new UserRegistration();
	   
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your last name: ");
	        String lastName = scanner.nextLine();
	        if (user.validLastName(lastName)) {
	            System.out.println("Valid last name: " + lastName);
	        } else {
	            System.out.println("Invalid last name. Please follow the specified format.");
	        }

	        scanner.close();
}
}
