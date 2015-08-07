package com.zlu.leetcode.treeproblem;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
    	return hasSum(root, 0,sum);
    }

    private  boolean hasSum(TreeNode root,int result,  int sum){

    	if(root == null ) return false;
    	if(root.right == null && root.left == null)
    		return result + root.val == sum;
    	return hasSum(root.left, result + root.val, sum) || hasSum(root.right, result + root.val, sum);
    	
    }
}
