package com.zlu.leetcode.arrayproblem;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		boolean[] barrel = new boolean[nums.length+1];
		for(int i = 0; i != nums.length; i++){
			barrel[nums[i]] = true;
		}
		for(int i = 0; i != barrel.length; i++){
			if(barrel[i] == false)
				return i;
		}
		return 0;
    }
}
