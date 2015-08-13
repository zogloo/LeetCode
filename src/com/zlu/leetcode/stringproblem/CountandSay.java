package com.zlu.leetcode.stringproblem;

//The count-and-say sequence is the sequence of integers beginning as follows:
//1, 11, 21, 1211, 111221, ...
//
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//Given an integer n, generate the nth sequence.
//
//Note: The sequence of integers will be represented as a string.

public class CountandSay {
	public String countAndSay(int n) {      
		StringBuilder result = new StringBuilder("1");
		for(int i = 0; i != n-1; i++){
			result = process(result);
		}
		return result.toString();    
    }
	
	private StringBuilder process(StringBuilder str){
		StringBuilder result = new StringBuilder();
		char c = str.charAt(0);
		int count = 0;
		for(int i = 0; i != str.length(); i++){
			if(str.charAt(i) == c)
				count++;
			else{
				result.append(count).append(c);
				c = str.charAt(i);
				count = 1;
			}
		}
		result.append(count).append(c);
		return result;
	}
}
