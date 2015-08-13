package com.zlu.leetcode.stringproblem;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        	return "";
        
        if(strs.length == 1)
        	return strs[0];
        int minLength = strs[0].length();
        for(int i = 0; i != strs.length; i++){
        	if(strs[i].length() < minLength)
        		minLength = strs[i].length();
        }

        int column = 0;
        for(;column != minLength; column++){
        	boolean flag = false;
	        for(int i = 0; i != strs.length; i++){
	        	if( strs[i].charAt(column) != strs[0].charAt(column)){
	        		flag = true;
	        		break;	        	
	        	}
	        }
	        if(flag)
	        	break;
        }
        return strs[0].substring(0, column);
            
	}
	
	
	
	public static void main(String[] args) {
		LongestCommonPrefix s = new LongestCommonPrefix();
		String[] strs = {"abcrgr", "abchf", "abitt","abcget"};
		System.out.println(s.longestCommonPrefix(strs));
	}

}
