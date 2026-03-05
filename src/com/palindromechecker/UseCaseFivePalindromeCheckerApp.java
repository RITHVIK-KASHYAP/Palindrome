package com.palindromechecker;

import java.util.Stack;

/**
 * Main Class - UseCaseFivePalindromeCheckerApp
 * 
 * Use Case 5: Stack based palindrome checker
 * 
 * Description:
 * This class validates  a palindrome using a stack data structure which follows
 * the LIFO principle.
 * 
 * At this stage, the application:
 * 	- Pushes characters into a stack.
 * 	- Pops them in reverse order
 * 	- Compares with original sequence
 * 	- Displays the result
 * 
 * This maps stack behavior to reversal logic.
 * 
 * @author Rithvik
 * @version 5.0
 */

public class UseCaseFivePalindromeCheckerApp {
	/**
	 * Application entry point for UC5.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		String input = "noon";
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : input.toCharArray()) {
			stack.push(c);
		}
		
		boolean isPalindrome = true;
		
		for (char c : input.toCharArray()) {
			if (c != stack.pop()) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome? : " + (isPalindrome ? "true" : "false"));
	}
}