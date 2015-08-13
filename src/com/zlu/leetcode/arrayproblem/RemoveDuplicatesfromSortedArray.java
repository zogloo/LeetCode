package com.zlu.leetcode.arrayproblem;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums.length < 2)
			return nums.length;
		int i = 0;
		int j = 1;
		while(j != nums.length){
			if(nums[i] == nums[j])
				j++;
			else{
				i++;
				nums[i] = nums[j];				
			}		
		}
		return i + 1;
	}
}
