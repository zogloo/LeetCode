package com.zlu.leetcode.stringproblem;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsinaString {
	public String reverseWords(String s){
		if(s.isEmpty())
			return s;
		List<String> str = new ArrayList<String>();
		int pFindNextChar = 0;
		int pFindFistSpace = 0;
		while(pFindNextChar != s.length()){
			while(pFindNextChar != s.length() && s.charAt(pFindNextChar) == ' ')
				pFindNextChar++;
			pFindFistSpace = pFindNextChar;
			while(pFindFistSpace != s.length() && s.charAt(pFindFistSpace) != ' ')
				pFindFistSpace++;
			if(pFindFistSpace != pFindNextChar)
				str.add(0,s.substring(pFindNextChar,pFindFistSpace));
			pFindNextChar = pFindFistSpace;
		}
		
		if(str.isEmpty())
			return new String();
		
		StringBuilder result = new StringBuilder();
		for (String string : str) {
			result.append(string).append(" ");
		}
		return result.substring(0,result.length()-1).toString();		
	}

}
