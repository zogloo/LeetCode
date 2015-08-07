package com.zlu.leetcode.mathproblem;

import java.util.HashSet;

public class HappyNumber {
	HashSet<Integer> hs = new HashSet<>();
    public boolean isHappy(int n) {
        int temp = n;
        while (!hs.contains(temp) ){
            hs.add(temp);
            temp = process(temp);
            if (temp == 1)
                return true;
        }
        return false;

    }
    public int process(int n){
        int result = 0;
        while( n != 0 ){
            int digit = n % 10;
            result += digit * digit;
            n /= 10;
        }
        return result;

    }
}
