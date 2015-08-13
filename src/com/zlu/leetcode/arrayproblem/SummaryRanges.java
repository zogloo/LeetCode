package com.zlu.leetcode.arrayproblem;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		int begin = 0;
		int end = 0;
		while(end != nums.length){
			String s = null;
			while( end+1 != nums.length && nums[end]+1 ==nums[end+1])
				end++;
			if(end-begin == 0){
				s = String.valueOf(nums[end]);
			}
			else
				s = String.valueOf(nums[begin]) + "->" + String.valueOf(nums[end]);
			list.add(s);
			begin = end + 1;
			end = begin;
		}
		return list;	        
	}
	
}
