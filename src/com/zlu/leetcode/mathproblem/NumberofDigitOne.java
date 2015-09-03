package com.zlu.leetcode.mathproblem;

//按位分析，如2015，从个位开始分析，假设从0000开始，
//个位要0~9转动201.5次才能得到2015，所以个位1出现的次数为202次
//十位至少要转动20.1次才能得到2015，所以十位1出现的次数为20*10 + 5 + 1 (0~5为6个数字)
//以此类推！
public class NumberofDigitOne {
	public int countDigitOne(int n) {
		if(n <= 0)
			return 0;
		int temp = n;
		int carry = 1;
		int sum = 0;
		while(n != 0){
			int digit = n % 10;
			n /= 10;
			if(digit == 0)
				sum += n * carry;
			else if(digit == 1)
				sum += n * carry + temp % carry + 1;
			else 
				sum += (n + 1) * carry;
			carry *= 10;
		}
		return sum;
	}
}
