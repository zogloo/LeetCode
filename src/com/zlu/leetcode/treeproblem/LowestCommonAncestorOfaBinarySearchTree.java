package com.zlu.leetcode.treeproblem;

//���ö����������������ȸ�С���������ȸ��������

public class LowestCommonAncestorOfaBinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null)
        	return null;
        
        if(p == root || q == root)
        	return root;
        
        if(p.val < root.val && q.val < root.val)
        	return lowestCommonAncestor(root.left, p, q);
        if(p.val > root.val && q.val > root.val)
        	return lowestCommonAncestor(root.right, p, q);
        
        return root;
    }
	
	
}
