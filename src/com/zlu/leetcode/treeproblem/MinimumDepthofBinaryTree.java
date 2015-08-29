package com.zlu.leetcode.treeproblem;

public class MinimumDepthofBinaryTree {
	public int minDepth(TreeNode root) {
        if(root == null) return 0;
		int l = minDepth(root.left);
		int r =minDepth(root.right);
		if(l == 0 && r == 0) return 1;
		else if(l == 0 && r != 0) return r + 1;
		else if(l != 0 && r == 0) return l + 1;
		return Math.min(l, r) + 1;
    }
}
