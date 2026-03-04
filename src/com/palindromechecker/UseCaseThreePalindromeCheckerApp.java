package com.palindromechecker;
/**
 * Main Class - Use Case 3
 * 
 * Use Case 3 - Reverse String based palindrome checker
 * 
 * Description:
 * This class checks whether a string is a palindrome by reversing the string
 * and comparing it with the original value.
 * 
 * At this stage, the application:
 * 	- Iterates the string in reverse order
 *  - Builds a reversed version
 *  - Compares original and reversed strings
 *  - Displays the validation result
 *  
 * This introduces transformation-based validation.
 * 
 * @author Rithvik
 * @version 3.0
 */

public class UseCaseThreePalindromeCheckerApp {
	/**
	 * Application entry point for UC3
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		String input = "level";
		String rev = "";
		for (int i = input.length()-1; i>=0; i--) {
			rev += input.charAt(i);
		}
		
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + rev);
		
		System.out.println("is Palindrome? : " + (input.equals(rev) ? "true" : "false"));
	}
}