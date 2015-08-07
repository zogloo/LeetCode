package com.zlu.leetcode.linkedlistproblem;

import java.util.LinkedList;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
    	if(head == null)
    		return true;
    	int length = 0;
    	ListNode temp = head;
    	while(temp != null){
    		length++;
    		temp = temp.next;
    	}
    	temp = head;
    	int half = length / 2;
    	LinkedList<Integer> stack = new LinkedList<>();
    	for(int i = 0; i != half; i++){
    		stack.add(0,temp.val);
    		temp = temp.next;
    	}
    	if(length % 2 == 1) temp = temp.next;
    	while(temp != null && stack.peek() == temp .val){
    		stack.removeFirst();
    		temp = temp.next;
    	}
    	if(temp == null) return true;
    	else return false;
    }
}
