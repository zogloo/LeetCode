package com.zlu.leetcode.stringproblem;

import java.util.ArrayList;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
    	if(numRows == 1 || numRows >= s.length()) return s;
    	ArrayList<StringBuilder> arr = new ArrayList<>();
    	for(int i = 0; i != numRows; i++)
    		arr.add(new StringBuilder());
    	int index = 0;
    	boolean flag = true;
    	for(int i = 0; i != s.length(); i++){
    		arr.get(index).append(s.charAt(i));
    		if(flag) index++;
    		else index--;
    		if(index == arr.size()-1) flag = false;
    		else if(index == 0) flag = true;
    	}
    	StringBuilder result = new StringBuilder();
        for(int i = 0; i != arr.size(); i++){
        	result.append(arr.get(i)) ;
        }
        return new String(result);
    }
}
