package com.zlu.leetcode.stackproblem;

import java.util.LinkedList;

public class MinStack {
	private LinkedList<Integer> l = new LinkedList<Integer>();
    private LinkedList<Integer> minstack = new LinkedList<Integer>();

    public void push(int x) {
        l.add(0,x);
        if(minstack.isEmpty() || x < minstack.peek())
            minstack.add(0,x);
        else
            minstack.add(0,minstack.peek());
    }

    public void pop() {
        if(minstack.size()>0 && l.size() > 0){
            l.remove(0);
            minstack.remove(0);
        }
    }

    public int top() {
            return l.peekFirst();
    }

    public int getMin() {
        return minstack.peekFirst();
    }
}
