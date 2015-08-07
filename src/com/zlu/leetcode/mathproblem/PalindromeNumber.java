package com.zlu.leetcode.mathproblem;

public class PalindromeNumber {
	 public boolean isPalindrome(int x) {
	        if(x < 0)
	            return false;
	        int temp = x;
	        int reverse = 0;
	        while (temp !=0){
	            int tail = temp % 10;
	            reverse = reverse * 10 + tail;
	            temp /= 10;
	        }

	        return x == reverse;
	    }
}
