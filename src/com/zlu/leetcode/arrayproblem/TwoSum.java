package com.zlu.leetcode.arrayproblem;

import java.util.Arrays;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        Node[] nodes = new Node[nums.length];
        for(int i = 0; i != nums.length; i++){
            nodes[i] = new Node(nums[i],i+1);
        }
        Arrays.sort(nodes);
        int i = 0;
        int j = nodes.length - 1;
        while( i < j){
            int sum = nodes[i].val+ nodes[j].val;
            if( sum == target){
                ret[0] = nodes[i].index;
                ret[1] = nodes[j].index;
                Arrays.sort(ret);
                break;
            }
            else if(sum > target) j--;
            else i++;
        }
        return ret;
    }
}

class Node implements Comparable<Node>{
    public int index;
    public int val;
    public Node(int val, int index){
        this.val = val;
        this.index = index;
    }

    @Override
    public int compareTo(Node o) {
        return this.val - o.val;
    }
}
