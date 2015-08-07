package com.zlu.leetcode.arrayproblem;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        int size = digits.length;
        int flag = size - 1;
        while(digits[flag] == 9 && flag != 0) {
            digits[flag] = 0;
            flag--;
        }
        if(flag == 0 && digits[flag] == 9){
            int[] result = new int[size+1];
            result[0] = 1;
            return result;
        }
        else
            digits[flag]++;
        return digits;
    }
}
