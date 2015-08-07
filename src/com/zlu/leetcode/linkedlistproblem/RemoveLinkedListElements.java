package com.zlu.leetcode.linkedlistproblem;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		   if(head == null) return head;
		   ListNode top = new ListNode(0);
		   top.next = head;
		    ListNode front = top;
	        ListNode current = head;
	        while(current != null){
	        	if(current.val == val)
	        		front.next = current.next;
	        	else front = front.next;
	        	current = current.next;        	
	        }
	        return top.next;    
	    }
}
