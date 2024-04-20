package com.leetcode.solutions.twosum;

public class TargetSumNotFoundException extends Exception {
	@Override
	public String getMessage() 
	{
		return "None of the elements add up to the target";
	}
}
