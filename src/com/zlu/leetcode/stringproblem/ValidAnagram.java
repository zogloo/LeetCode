package com.zlu.leetcode.stringproblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i != s.length(); i++){
        	if(!map.containsKey(s.charAt(i)))
        		map.put(s.charAt(i), 1);
        	else
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);   		
        }
        
        for(int i = 0; i != t.length(); i++){
        	if( !map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) == 0 )
        		return false;
        	else      
        		map.put(t.charAt(i), map.get(t.charAt(i))-1);
        }
        
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){
        	Map.Entry<Character, Integer> entry= (Map.Entry)iter.next();
        	if(entry.getValue() != 0)
        		return false;
        }
        return true;
    }

}
