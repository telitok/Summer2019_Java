package day19_ForLoop;

import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
		/*
		 Task
		 Given username: cybertek.batch12@gmail.com
		       password: Javengers
		       
		 Write a program for the login functionality of the gmail account. (user input is required)
		 => user name can be entered either in upper or lower case
		 => password must be entered as above.
		 => if the username does not end with "gmail.com"
		    print "it's not a valid email"
		 => if username ends with "gmail.com" but username and password did not match
		    print "invalid username or password"
		    print "
		 */
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your username");
		String user = input.nextLine().toLowerCase();
		
		System.out.println("Enter your password");
		String pass = input.nextLine();
		
		String username = "cybertek.BatCH12@gmail.com";
		String password = "Javengers";
		
		if (user.endsWith("@gmail.com")) {
			if (user.equalsIgnoreCase(username) && pass.equals(password)) {
				System.out.println("Logged in succesfully");
			}
			else {
				if(!user.equalsIgnoreCase(username) && !pass.equals(password)) {
					System.out.println("Both username and password are incorrect");
				}else if(!user.equalsIgnoreCase(username)) {
					System.out.println("Invalid username");
				}else {
					System.out.println("Invalid password");
				}
			}
		}
		else {
			System.out.println("It is not a valid email address");
		}

	}
}
