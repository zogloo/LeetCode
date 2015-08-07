package com.zlu.leetcode.mathproblem;

public class ReverseInteger {
	public int reverse(int x) {
        if(x/10 == 0) return x;
        if(x > 2147483641 || x < -2147483641)
        	return 0;
        boolean flag = false;
        if(x < 0) flag = true;
        x= Math.abs(x);
        long result = 0;
        while(x  != 0){
        	result = 10*result + x%10;
        	if(result > Integer.MAX_VALUE)
        		return 0;
        	x /= 10;
        }
        return (int)(flag ? -result : result);
    }
}
