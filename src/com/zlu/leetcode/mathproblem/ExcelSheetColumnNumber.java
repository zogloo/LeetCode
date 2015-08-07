package com.zlu.leetcode.mathproblem;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
    	int base = 'A' - 1;
    	int result = 0;
        for(int i = 0; i != s.length(); i++){
        	int num = s.charAt(i) - base;
        	result = 26*result + num;
        }
        return result;
    }
}
