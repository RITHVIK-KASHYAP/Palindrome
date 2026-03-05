package com.palindromechecker;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Main Class - Use Case 6 Palindrome Checker App
 * 
 * UseCase6: Queue + Stack Fairness Check
 * 
 * Description:
 * This class demonstrates palindrome validation using two different data structures:
 * 	- Queue (FIFO - First In First Out)
 * 	- Stack (LIFO - Last In First Out)
 * 
 * Characters are inserted into both structures and then compared by removing
 * from the front of the queue and the top of the stack.
 * 
 * If all characters match, the input string is confirmed as a palindrome.
 * 
 * This use case helps understand how FIFO and LIFO behaviors
 * can be combined for symmetric comparison.
 * 
 * @author Rithvik
 * @version 6.0 
 */

public class UseCaseSixPalindromeCheckerApp 
{
	/**
	 * Application entry point for UC5.
	 * 
	 * @param args Command-line arguments
	 */

	public static void main(String[] args) 
	{
		String input = "civic";
		Queue<Character> queue = new LinkedList<Character>();		
		Stack<Character> stack = new Stack<Character>();		
		for (char c : input.toCharArray()) 
		{
			queue.add(c);
			stack.push(c);
		}		
		boolean isPalindrome = true;		
		while (!queue.isEmpty()) 
		{
			if (!(queue.remove().equals(stack.pop()))) 
			{
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome? " + (isPalindrome ? "true" : "false"));
	}
}