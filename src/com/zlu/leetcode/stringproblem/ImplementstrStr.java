package com.zlu.leetcode.stringproblem;

public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
		if(needle.isEmpty())
		return 0;
		if(haystack.length() < needle.length() )
			return -1;
		
        int processLength = haystack.length() - needle.length() + 1;
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        int index = 0;
        while(index != processLength){
        	while(index != processLength && hay[index] != need[0])
        		index++;
        	if(index == processLength)
        		return -1;
        	int temp = index;
        	while(temp-index != need.length && hay[temp] == need[temp-index])
        		temp++;
        	if(temp-index == need.length)
        		return index;
        	else index++;
        }
        return -1;
    }
}
