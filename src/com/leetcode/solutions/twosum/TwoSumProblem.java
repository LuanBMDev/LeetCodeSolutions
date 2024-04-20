package com.leetcode.solutions.twosum;

public class TwoSumProblem 
{
	// ENUNCIATION:
	/*
	 * Given an array of integers nums and an integer target,
	 * return indices of the two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, 
	 * and you may not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * Example:
	 *
	 *  Input: nums = [2,7,11,15], target = 9
	 *  Output: [0,1]
	 *  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	 */
	
	public static void main(String[] args) 
	{
		int numbers[] = {2, 7, 11, 15};
		int sumTarget = 9;
		try 
		{
			int sumIndexes[] = twoSum(numbers, sumTarget);
			
			System.out.println(sumIndexes[0] + " " + sumIndexes[1]);
		}
		catch (TargetSumNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	// Method made static in order to be called in 'main'
	public static int[] twoSum(int[] nums, int target) throws TargetSumNotFoundException
	{
		int[] twoNumbersIndex = new int[2];
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums.length; j++)
			{ 
				if (nums[i]+nums[j] == target)
				{
					if (i==j) // Makes so the same elements can't be used twice
					{
						continue;
					}
					else
					{
						twoNumbersIndex[0] = i;
						twoNumbersIndex[1] = j;
						
						// Breaks both loops in order to stick with the first solution it sees.
						i = nums.length + 1;
						j = nums.length + 1;
					}
				}
			}
		}
		
		/*
		 * Throws an Exception created in a separate class file when
		 * it doesn't find any elements that add up to the target
		 */
		if (twoNumbersIndex[0] == 0 && twoNumbersIndex[1] == 0)
		{
			throw new TargetSumNotFoundException();
		}
		
		return twoNumbersIndex;
	}
}
