package com.zlu.leetcode.stringproblem;

import java.util.LinkedList;

public class ValidParentheses {
	public boolean isValid(String s) {
    	LinkedList<Character> stack = new LinkedList<>();
    	for(int i = 0; i != s.length(); i++){
    		if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
    				stack.push(s.charAt(i));
    		else{
	    		switch(s.charAt(i)){
	    		case ')' :
	    			if(!stack.isEmpty() && stack.pop() == '(')
	    				break;
	    			else return false;
	    		case ']' :
	    			if(!stack.isEmpty() && stack.pop() == '[')
	    				break;
	    			else return false;
	    		case '}' :
	    			if(!stack.isEmpty() && stack.pop() == '{')
	    				break;
	    			else return false;
	    		}
    			
    		}
    	}   
    	if(stack.isEmpty()) return true;
    	else return false;
    }
}
