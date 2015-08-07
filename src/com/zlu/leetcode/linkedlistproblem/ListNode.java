package com.zlu.leetcode.linkedlistproblem;
import java.util.*;

public class ListNode {
		public int val;
		public ListNode next;
		
		public ListNode(int val){
			this.val = val;
			next = null;
		}
		
		public ListNode(int val, ListNode next){
			this.val = val;
			this.next = next;
		}
		
		public static void printList(ListNode head) {
			ListNode temp = head;
			while(temp != null){
				System.out.print(temp.val + " ");
				temp = temp.next;
			}
			System.out.println();
		}
}
