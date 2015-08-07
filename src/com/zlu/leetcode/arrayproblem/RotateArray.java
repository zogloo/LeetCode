package com.zlu.leetcode.arrayproblem;

public class RotateArray {
	public void rotate(int[] nums, int k) {
        if(k > nums.length)
             k = k % nums.length;
        flip(nums,0,nums.length-k);
        flip(nums,nums.length-k,nums.length);
        flip(nums,0,nums.length);

    }

     private void flip(int[] nums, int indexBegin, int indexEnd){
         int left = indexBegin;
         int right = indexEnd - 1;
         while(left < right) {
             int temp = nums[left];
             nums[left] = nums[right];
             nums[right] = temp;
             left++;
             right--;
         }
     }
}
