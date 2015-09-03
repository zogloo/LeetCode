package com.zlu.leetcode.mathproblem;

//��λ��������2015���Ӹ�λ��ʼ�����������0000��ʼ��
//��λҪ0~9ת��201.5�β��ܵõ�2015�����Ը�λ1���ֵĴ���Ϊ202��
//ʮλ����Ҫת��20.1�β��ܵõ�2015������ʮλ1���ֵĴ���Ϊ20*10 + 5 + 1 (0~5Ϊ6������)
//�Դ����ƣ�
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
