package com.zlu.leetcode.treeproblem;

public class TreeNode {
      int val;
     TreeNode left = null;
      TreeNode right = null;
      TreeNode(int x) { val = x; }
      public TreeNode(int val, TreeNode left, TreeNode right){
    	  this.val = val;
    	  this.left = left;
    	  this.right = right;
      }
      
      public static void preOrderPrint(TreeNode head){
    	  if(head == null) return;
    	  System.out.print(head.val + " ");
    	  preOrderPrint(head.left);
    	  preOrderPrint(head.right);    	  
      }
      public static void inOrderPrint(TreeNode head){
    	  if(head == null) return;
    	  inOrderPrint(head.left);
    	  System.out.print(head.val + " ");
    	  inOrderPrint(head.right);    	  
      }
      public static void postOrderPrint(TreeNode head){
    	  if(head == null) return;  	  
    	  postOrderPrint(head.left);
    	  postOrderPrint(head.right);    	  
    	  System.out.print(head.val + " ");
      }
      
      public static void creatSampleTree(TreeNode head) {
    	  TreeNode node11 = new TreeNode(11); 
    	  TreeNode node10 = new TreeNode(10); 
    	  TreeNode node9 = new TreeNode(9); 
    	  TreeNode node8 = new TreeNode(8,null,node11); 
    	  TreeNode node7= new TreeNode(7,null,node10); 
    	  TreeNode node6 = new TreeNode(6,node9,null); 
    	  TreeNode node5= new TreeNode(5); 
    	  TreeNode node4= new TreeNode(4,node8,null); 
    	  TreeNode node3 = new TreeNode(3,node6,node7); 
    	  TreeNode node2 = new TreeNode(2,node4,node5);
    	  head.left = node2;
    	  head.right = node3;		
	}
  }