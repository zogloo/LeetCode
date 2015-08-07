package com.zlu.leetcode.linkedlistproblem;

public class IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if(headA == null || headB == null)
    		return null;
    	
    	ListNode tempA = headA;
    	ListNode tempB = headB;
    	int lengthA = 0;
    	int lengthB = 0;
    	while(tempA != null){
    		lengthA++;
    		tempA = tempA.next;
    	}
    	tempA = headA;
    	while(tempB != null){
    		lengthB++;
    		tempB = tempB.next;
    	}
    	tempB = headB;
    	if(lengthA != lengthB){
    		int diff = Math.abs(lengthA - lengthB);
    		if(lengthA > lengthB){
    			for(int i = 0; i != diff; i++)
    				tempA = tempA.next;
    		}
    		else{
    			for(int i = 0; i != diff; i++)
    				tempB = tempB.next;
    		}
    	}
    	while(tempA != tempB){
    		tempA = tempA.next;
    		tempB = tempB.next;
    	}
    	return tempA;
    }
}
