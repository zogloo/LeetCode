package com.zlu.leetcode.treeproblem;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
		 if (root == null) return result;
		 ArrayList<TreeNode> level1 = new ArrayList<>();	 
		 level1.add(root);

		 while(!level1.isEmpty()){
			 ArrayList<Integer> currentLine = new ArrayList<>();
			 ArrayList<TreeNode> level2 = new ArrayList<>();
			 for(int i = 0; i != level1.size(); i++){
				 currentLine.add(level1.get(i).val);
				 if(level1.get(i).left != null) level2.add(level1.get(i).left);
				 if(level1.get(i).right != null) level2.add(level1.get(i).right);
			 }
			 result.add(0, currentLine);
			 level1 = level2;
		 }
		 return result;
	 }
}
