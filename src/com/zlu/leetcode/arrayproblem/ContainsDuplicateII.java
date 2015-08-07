package com.zlu.leetcode.arrayproblem;

import java.util.HashSet;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 )
        	return false;
        
        HashSet<Integer> hs = new HashSet<>();
        int i = 0;
        int j = 0;
        while( j != nums.length && hs.add(nums[j])){
        	j++;
        	if(j > k){
        		hs.remove(nums[i]);
        		i++;
        	}
        }
        if(j == nums.length) return false;
        else return true;
    }
}
