package com.palindromechecker;

/**
*This class provides a Deque based 
*strategy to check if the given string
*is a palindrome or not
*
**/
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStrategy implements PalindromeStrategy 
{
    @Override
    public boolean check(String s) 
    {
        if (s == null) 
        {
        	return false;
        }
        Deque<Character> d = new ArrayDeque<>();
        for (char c : s.toCharArray()) 
        {
        	d.addLast(c);
        }
        while (d.size() > 1)
        {
            if (!d.removeFirst().equals(d.removeLast()))
            {
            	return false;
            }
        }
        return true;
    }
}