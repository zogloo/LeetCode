package com.zlu.leetcode.dynamicprogram;

import java.util.HashMap;

public class ClimbingStairs {
	HashMap<Integer,Integer> hs = new HashMap<>();

    public int climbStairs(int n) {
        if( n <= 0){
            throw new IllegalArgumentException("must not less than 0");
        }

        hs.put(1,1);
        hs.put(2,2);
        return fiBn(n);
    }

    private int fiBn(int n ){
        if(hs.containsKey(n)){
            return hs.get(n);
        }

        int value = fiBn(n-1) + fiBn(n-2);
        hs.put(n,value);
        return value;
    }
}
