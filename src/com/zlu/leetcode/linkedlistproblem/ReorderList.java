package com.zlu.leetcode.linkedlistproblem;

public class ReorderList {
	public void reorderList(ListNode head) {
		int length = 0;
		ListNode temp = head;
		while(temp != null){
			length++;
			temp = temp.next;
		}
		if(length < 3) return;
		
		ListNode first = head;
		temp = head;
		for(int i = 0; i != (length-1)/2; i++){
			temp = temp.next;
		}
		ListNode second = temp.next;
		temp.next = null;
		second = reverseList(second);
		while(first != null && second != null){
			ListNode firstTemp = first;
			first = first.next;
			firstTemp.next = second;
			ListNode secTemp = second;
			second = second.next;
			secTemp.next = first;   			
		}   
}

	private ListNode  reverseList(ListNode head){
		ListNode pre = null;
		ListNode cur = head;
		ListNode beh = head.next;
		while(cur != null){
			cur.next = pre;
			pre = cur;
			cur = beh;
			if(beh != null) beh = beh.next;
		}
		return pre;
	}    
}
