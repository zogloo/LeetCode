package com.zlu.leetcode.mathproblem;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {

    	StringBuilder result = new StringBuilder();	
    	while(n != 0){
    		n = n -1;
    		char  c = (char)('A' + n %26);
    		result.append(c);
    		n /= 26;
    	}
    	return new String(result.reverse());
    }
}
