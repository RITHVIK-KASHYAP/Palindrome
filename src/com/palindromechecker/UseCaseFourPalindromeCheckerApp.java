package com.palindromechecker;

/**
 * Main Class - Use Case 4 PalindromeCheckerApp
 * 
 * Use Case 4: Character Array Based Validation
 * 
 * Description:
 * This class is validates a palindrome by converting the string into a character
 * array and comparing characters using the two-pointer approach
 * 
 * At this stage, the application:
 * 	- Converts string to char array
 *  - uses start and end pointers
 *  - compares characters efficiently
 *  - Displays the result
 *  
 * This reduces extra memory usage.
 * 
 * @author Rithvik
 * @version 4.0
 */

public class UseCaseFourPalindromeCheckerApp {
	/**
	 * Application entry point for UC4
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		String input = "radar";
		
		char[] chars = input.toCharArray();
		
		int start = 0;
		int end = chars.length - 1;
		boolean isPalindrome = true;
		
		while (start < end) {
			if (chars[start] != chars[end]) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		
		System.out.println("Input: " + input);
		System.out.println("Is Palindrom? : " + (isPalindrome ? "true" : "false"));
		
	}
}