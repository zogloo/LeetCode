package com.zlu.leetcode.linkedlistproblem;

public class DeleteNodeinaLinkedList {
	public void deleteNode(ListNode node) {
    	if(node ==null || node.next == null)
    		return;
       node.val = node.next.val;
       node.next = node.next.next;
        
    }
}
