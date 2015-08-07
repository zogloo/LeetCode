package com.zlu.leetcode.linkedlistproblem;

public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode left = pre;
        ListNode right = pre;
        for(int i = 0; i != n; i++){
            right = right.next;
            if(right == null)
                return pre.next;
        }

        while(right.next != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return pre.next;
    }
}
