package com.zlu.leetcode.treeproblem;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	private List<String> result = new ArrayList<String>();
	
	public List<String> binaryTreePaths(TreeNode root) { 
		if(root == null) 
			return result;
		String s = new String();
		dfs(root, s);
		return result;
    }
	
	private void dfs(TreeNode root,String s) {
		if (root == null) 
			return ;
	
		s = s + String.valueOf(root.val) + "->";
		if(root.left == null && root.right == null)
			result.add(s.substring(0,s.length()-2));
		
		dfs(root.left, s);
		dfs(root.right, s);
	}
	
}
