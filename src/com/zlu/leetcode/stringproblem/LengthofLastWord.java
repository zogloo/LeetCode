package com.zlu.leetcode.stringproblem;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
        if(s == null || s.length()==0)
        	return 0;
        char[] str = s.toCharArray();
		int right = s.length()-1;
		while(right >= 0 && str[right] == ' ')
			right--;
		if(right < 0) return 0;
		int left = right;
		while(left >= 0 && str[left] != ' ')
			left--;
		return right - left; 
    }
}
