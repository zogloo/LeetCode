package com.zlu.leetcode.arrayproblem;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	 public String largestNumber(int[] nums) {
	        String[] str = new String[nums.length];
	        for(int i = 0; i != nums.length; i++){
	        	str[i] = String.valueOf(nums[i]);
	        }
	        Arrays.sort(str, new Comparator<String>() {
	        										@Override
	        										public int compare(String o1, String o2) {
	        											return (o2+o1).compareTo(o1+o2);
	        										}				
	        });
	        
	        if(str[0].equals("0"))
	        	return "0";
	        StringBuilder sb = new StringBuilder();
	        for (String string : str) {
				sb.append(string);
			}
	        return sb.toString();
	 }
	 
}
