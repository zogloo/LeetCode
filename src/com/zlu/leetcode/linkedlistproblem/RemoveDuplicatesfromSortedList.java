package com.zlu.leetcode.linkedlistproblem;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
    	ListNode stay = head;
    	ListNode check = head;
    	while(check != null){
    		while(check != null && check.val == stay.val  ) check = check.next;
    		stay.next = check;
    		stay = stay.next;
    	}
    	return head;
    }
}
