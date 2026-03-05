package com.palindromechecker;

/**
 * Main Class - Use Case 10
 * 
 * UseCase10: Case-Insensitive & Space-Ignored Palindrome
 * 
 * Description:
 * This class validates a palindrome using a LinkedList.
 * 
 * Characters are inserted into the list and then compared by
 * removing elements from both ends:
 * 	-removeFirst()
 * 	-removeLast()
 * 
 * This use case demonstrates how LinkedList supports double-ended operations for
 * symmetric validation.
 * 
 * @author Rithvik
 * @version 10.0
 */
public class UseCaseTenPalindromeCheckerApp 
{
	/**
	 * Application entry point for UC10.
	 * 
	 * @param args Command-line arguments
	 */
	
	public static void main(String[] args) 
	{
		String input = "A man a plan a canal Panama";		
		String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();		
		boolean isPalindrome = true;		
		for (int i=0; i<normalized.length()/2; i++) 
		{
			if (normalized.charAt(i) != normalized.charAt(normalized.length()-1-i)) 
			{
				isPalindrome = false;
				break;
			}
		}		
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome ? " + isPalindrome);
	}
}