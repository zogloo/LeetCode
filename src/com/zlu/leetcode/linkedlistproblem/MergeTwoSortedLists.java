package com.zlu.leetcode.linkedlistproblem;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode result = new ListNode(0);
    	ListNode end = result;
    	while(l1 != null && l2 != null){
    		if(l1.val < l2.val){
    			end.next = l1;
    			l1 = l1.next;
    		}
    		else{
    			end.next = l2;
    			l2 = l2.next;
    		}
    		end = end.next;
    	}
    	
    	if(l1 == null) end.next = l2;
    	else end.next = l1;
    	return result.next;
        
    }
}
