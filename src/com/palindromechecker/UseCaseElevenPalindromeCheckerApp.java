package com.palindromechecker;

public class UseCaseElevenPalindromeCheckerApp 
{
	
	/**
	 * Main Class - Use Case 11 
	 * 
	 * Use Case 11: Object-Oriented Palindrome Service
	 * 
	 * Description:
	 * This class demonstrates palindrome validation using object oriented design.

	 * The palindrome logic is encapsulated inside a PalindromeService class.
	 * 
	 * This improves:
	 * 	- Resuability
	 * 	- Readability
	 * 	- Seperation of Concerns
	 * 
	 * @author Rithvik
	 * @version 11.0
	 */

	public static void main(String[] args) 
	{
		/**
		 * Application entry point for UC11
		 * 
		 * @param args Command-line arguments.
		 */
		PalindromeService palindromeService = new PalindromeService();
		String input = "racecar";
		boolean isPalindrome = palindromeService.checkPalindrome(input);
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome ? " + isPalindrome);
	}
}

class PalindromeService 
{
	/**
	 * Checks whether the input string is a palindrome.
	 * 
	 * @param input Input string
	 * @return true if palindrome, false otherwise
	 */
	
	public boolean checkPalindrome(String input) 
	{
		int start = 0;
		int end = input.length() - 1;
		while (start < end) 
		{
			if (input.charAt(start) != input.charAt(end)) 
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}