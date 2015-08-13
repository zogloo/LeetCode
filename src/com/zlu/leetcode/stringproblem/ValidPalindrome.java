package com.zlu.leetcode.stringproblem;

public class ValidPalindrome {
	
	public boolean isPalindrome(String s) {
        if(s == null) return false;
		if(s.length() < 2) return true;
		int left = 0;
		char[] str = s.toCharArray();
		int right = s.length()-1;
		while(left < right){
			while(left < right && !isValidChar(str[left]))
				left++;
			while(left < right && !isValidChar(str[right]))
				right--;
			if(Character.toLowerCase(str[left]) != Character.toLowerCase(str[right]))
				return false;
			left++;
			right--;
		}
        return true;
		
    }
	
	private boolean isValidChar(char c){
		return Character.isLetter(c) || Character.isDigit(c);
	}
	
}
