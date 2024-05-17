package com.leetcode.solutions.palindromenumber;

public class Main 
{

	public static void main(String[] args) 
	{
		PalindromeNumber palinNum = new PalindromeNumber();
		
		int numberToText = 121;
		int numeral = -121;
		
		String msgString = numberToText + ": " + palinNum.isPalindromeString(numberToText);
		String msgNumeral = numeral + ": " + palinNum.isPalindromeNumber(numeral);
		
		System.out.println(msgString);
		System.out.println(msgNumeral);
	}

}
