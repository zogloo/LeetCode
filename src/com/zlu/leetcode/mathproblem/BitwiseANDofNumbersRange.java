package com.zlu.leetcode.mathproblem;


//��m,n�Ķ���������Чλ����һ�������Ϊ0;
//��m,n�Ķ���������Чλ��һ�����������ߵĲ�һ���Ķ�����λ���磺101 1010, 100 1001
//��ߵĲ�һ���Ķ�����λ�ǵ�4λ����ѵ�0~4λȫ����0�������Ϊ��  100 0000
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
