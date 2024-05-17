package com.leetcode.solutions.palindromenumber;

//import java.util.Iterator;

/**
 * STATEMENT: 
 * 
 * Given an integer x, return true if x is a palindrome, and 
 * false otherwise.
 * 
 * 
 * Extra:
 * Do it without converting x to String
 */

public class PalindromeNumber 
{
	public boolean isPalindromeString(int x)
	{
		String numberInText = Integer.toString(x);
		String inversedNumber = new StringBuilder(numberInText).reverse().toString();
		
		if (numberInText.equals(inversedNumber))
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isPalindromeNumber(int x)
	{
		if (x < 0) 
		{
			return false;
		}
		
		int reversedX = 0;
		int num = x;
		
		while(num != 0)
		{
			int digit = num % 10;
			reversedX = reversedX * 10 + digit;
			num /= 10;
		}

		return x == reversedX;
	}
}
