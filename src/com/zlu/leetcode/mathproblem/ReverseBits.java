package com.zlu.leetcode.mathproblem;

public class ReverseBits {
	public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i != 32; i++){
        	result = 2*result + (1&n);
        	n = n >>>1;
        }
        return result;
    }
}
