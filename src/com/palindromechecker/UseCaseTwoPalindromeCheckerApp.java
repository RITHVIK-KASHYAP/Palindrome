package com.palindromechecker;
/**
 * Main Class - Use Case 2 PalindromeCheckerApp
 * 
 * Use Case 2: Print a Hardcoded Palindrome Result
 * 
 * Description:
 * This class demonstrates a basic palindrome validation using a hardcoded string value.

 * 
 * At this stage, the application:
 * 	- Stores a predefined string
 * 	- Compares characters from both ends
 * 	- Determines whether the string is a palindrome
 * 	- Displays the result on the console.
 * 
 * This use case introduces fundamental comparison logic before using
 * advanced data structures.
 * 
 * @author Rithvik
 * @version 2.0
 */

public class UseCaseTwoPalindromeCheckerApp {

	/**
	 * Application entry point for UC2
	 * 
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {

		String input = "madam";
		boolean isPalindrome = true;
		System.out.println("Input text: " + input);
		
		for (int i=0; i< input.length()/2; i++) {
			if (input.charAt(i) != input.charAt(input.length()-1-i)) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println("Is it a palindrome:? " + (isPalindrome ? "true" : "false"));
	}
}