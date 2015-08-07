//Given a string, find the length of the longest substring without repeating characters.
//For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
//which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

package com.zlu.leetcode.stringproblem;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		 if(s == null || s.isEmpty())
			 return 0;
		HashSet<Character> hs = new HashSet<>();
		 int maxLength = 0;
		for(int i = 0; i != s.length(); i++){
			if(!hs.contains(s.charAt(i)))
				hs.add(s.charAt(i));
			else{
				if(hs.size() > maxLength)
					maxLength = hs.size();
				hs.clear();
				hs.add(s.charAt(i));
			}
		}
		return hs.size() > maxLength ? hs.size() : maxLength;
	}
	        
	
	
	 public static void main(String[] args){
		 System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("ax"));
	 }
}
