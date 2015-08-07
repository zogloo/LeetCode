package com.zlu.leetcode.mathproblem;

public class Pow {
	public double myPow(double x, int n) {
        if(n == 0 || x== 1) return  1;
        if(x == -1) return n%2==0 ? 1:-1 ;
        if(x > -0.0001 && x < 0.0001) return 0;

        double result = 1.0;
        for (int i = 0; i != Math.abs(n); i++)
            result *= x;
        if(n > 0) return result;
        else return  1/result;

    }
}
