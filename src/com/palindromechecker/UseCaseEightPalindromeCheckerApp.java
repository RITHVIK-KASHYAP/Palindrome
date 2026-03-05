package com.palindromechecker;

import java.util.LinkedList;

/**
 * Main Class - Use Case 8
 * 
 * UseCase8: Linked List-Based Palindrome Checker
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
 * @version 8.0
 */

public class UseCaseEightPalindromeCheckerApp 
{
	/**
	 * Application entry point for UC5.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) 
	{
		String input = "level";	
		LinkedList<Character> list = new LinkedList<Character>();
		for (char c : input.toCharArray()) 
		{
			list.add(c);
		}
		boolean isPalindrome = true;
		while (list.size() > 1) 
		{
			if (!(list.removeFirst().equals(list.removeLast()))) 
			{
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome? " + (isPalindrome ? "true" : "false"));
	}
}