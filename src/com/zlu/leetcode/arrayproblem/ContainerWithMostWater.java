package com.zlu.leetcode.arrayproblem;
//Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
//n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
//Find two lines, which together with x-axis forms a container, such that the container contains the most water.

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height.length < 2)
        	return 0;
        
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
        	int currArea = Math.min(height[left], height[right]) * (right - left);
        	if(currArea > area)
        		area = currArea;
        	if(height[left] <= height[right])
        		left++;
        	else 
        		right--;
        }
        return area;
    }
}
