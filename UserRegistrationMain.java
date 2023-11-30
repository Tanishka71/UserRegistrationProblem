package com.bridgelabz.user;
import java.util.Scanner;

public class UserRegistrationMain {
//desc:main function
	   public static void main(String[] args) {
		   UserRegistration user=new UserRegistration();
	   
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your phoneNo: ");
	        String phoneNo = scanner.nextLine();
	        if (user.isValidPhoneNo(phoneNo)) {
	            System.out.println("Valid phoneNo: " + phoneNo);
	        } else {
	            System.out.println("Invalid phoneNo. Please follow the specified format.");
	        }

	        scanner.close();
}
}
