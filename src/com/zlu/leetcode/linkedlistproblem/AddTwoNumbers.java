package com.zlu.leetcode.linkedlistproblem;

public class AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode result = new ListNode(0);
			ListNode temp1 = l1;
			ListNode temp2 = l2;
			ListNode tempR = result;
			int carry = 0;
			
			while(temp1 != null || temp2 != null){
				if(temp1 != null){
					carry += temp1.val;
					temp1 = temp1.next;
				}
				if(temp2 != null){
					carry += temp2.val;
					temp2 = temp2.next;
				}
				tempR.next = new ListNode(carry % 10);
				carry /= 10;				
			}
			
			if(carry == 1)
				tempR.next = new ListNode(1);
			
			return result.next;			
	    }
}
