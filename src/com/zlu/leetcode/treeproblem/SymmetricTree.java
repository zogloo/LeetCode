package com.zlu.leetcode.treeproblem;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root){
		if(root == null) return true;
		return isSymmetric(root,root);
	}
    public boolean isSymmetric(TreeNode p, TreeNode q) {
    	if(p == null && q == null) return true;
    	else if(p == null || q == null) return false;
    	
    	if(p.val != q.val) return false;
    	
    	return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);       
    }
}
