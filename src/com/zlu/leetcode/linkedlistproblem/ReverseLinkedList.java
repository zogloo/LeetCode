package com.zlu.leetcode.linkedlistproblem;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode previous = null;
        ListNode current = head;
        ListNode behind = head.next;
        while(current != null){
            current.next = previous;
            previous = current;
            current = behind;
            if(current == null) break;;
            behind = behind.next;

        }
        return previous;
    }
}
