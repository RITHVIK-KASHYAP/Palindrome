package com.palindromechecker;

public class UseCaseNinePalindromeCheckerApp 
{
/**
 * Main Class - Use Case 9
 * 
 * UseCase9: Recursive Palindrome Checker
 * 
 * Description:
 * This class validates a palindrome using recursion.
 * 
 * Characters are compared from the outer positions moving inward
 * using recursive calls.
 * 
 * The recursion stops when: 
 * 	- All characters are mathced or
 *  - a mismatch is found
 * 
 * This use case demonstrates divide-and-conquer logic
 * using method recursion
 * 
 * @author Rithvik
 * @version 9.0
 */

	public static void main(String[] args) 
	{
		/**
		 * Application entry point for UC9.
		 * 
		 * @param args Command-line arguments
		 */
		String input = "madam";		
		System.out.println("Input: " + input);
		boolean isPalindrome = check(input, 0, input.length()-1);
		System.out.println("Is Palindrome ? " + isPalindrome);
	}
	
	/**
	 * Recursively checks whether a string is palindrome.
	 * 
	 * @param s Input string
	 * @param start Starting index
	 * @param end ending index
	 * @return true if palindrom, otherwise false
	 */	
	
	private static boolean check(String s, int start, int end) 
	{
		if (start >= end) 
		{
			return true;
		}		
		if (s.charAt(start) != s.charAt(end)) 
		{
			return false;
		}		
		return check(s, start+1, end-1);
	}
}