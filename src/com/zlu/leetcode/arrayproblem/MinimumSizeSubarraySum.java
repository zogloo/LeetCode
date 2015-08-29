package com.zlu.leetcode.arrayproblem;

//Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ¡Ý s. 
//If there isn't one, return 0 instead.
//For example, given the array [2,3,1,2,4,3] and s = 7,
//the subarray [4,3] has the minimal length under the problem constraint.

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
		if(nums.length == 0) return 0;
		int left = 0;
		int right = left;
		int sum = 0;
		int minLength = nums.length + 1;
		while(left <= right && right != nums.length ){
			while(right != nums.length && sum < s)
				sum += nums[right++];
			while(left < right && sum >= s){
				minLength = Math.min(minLength, right-left);
				sum -= nums[left++];
			}			
		}
		return minLength == nums.length + 1 ? 0 : minLength;       
    }
}
