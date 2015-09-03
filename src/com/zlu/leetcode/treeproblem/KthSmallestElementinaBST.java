package com.zlu.leetcode.treeproblem;

import java.util.ArrayList;

public class KthSmallestElementinaBST {
	private ArrayList<Integer> arr = new ArrayList<>();
	public int kthSmallest(TreeNode root, int k) {
		inOrderTravel(root);
		return arr.get(k-1);
	}
	
	public void inOrderTravel(TreeNode root) {
		if(root == null)
			return;
		inOrderTravel(root.left);
		arr.add(root.val);
		inOrderTravel(root.right);
	}
	
}
