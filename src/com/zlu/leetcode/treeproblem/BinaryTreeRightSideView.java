package com.zlu.leetcode.treeproblem;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
	 public List<Integer> rightSideView(TreeNode root) {
		 List<Integer> result = new ArrayList<>();
		 if(root == null)
	        	return result;
	        
	        List<TreeNode> curLine = new ArrayList<>();
	        curLine.add(root);
	        while(!curLine.isEmpty()){
	        	result.add(curLine.get(0).val);
	        	List<TreeNode> newLine = new ArrayList<>();
	        	for(int i = 0; i != curLine.size(); i++){
	        		if(curLine.get(i).right != null)
	        			newLine.add(curLine.get(i).right);
	        		if(curLine.get(i).left != null)
	        			newLine.add(curLine.get(i).left);
	        	}
	        	curLine = newLine;
	        }
	        return result;
	}
	 
}
