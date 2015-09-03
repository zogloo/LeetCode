package com.zlu.leetcode.mathproblem;


//若m,n的二进制数有效位数不一样，结果为0;
//若m,n的二进制数有效位数一样，则算出最高的不一样的二进制位，如：101 1010, 100 1001
//最高的不一样的二进制位是第4位，则把第0~4位全部置0，结果则为：  100 0000
public class BitwiseANDofNumbersRange {
	public int rangeBitwiseAnd(int m, int n) {
		int count = 0;
		while(m != n && m != 0 && n != 0){
			count++;
			m >>>= 1;
			n >>>= 1;
		}		
		if(n != m) return 0;
		return n * (int)Math.pow(2, count);
    }
}
