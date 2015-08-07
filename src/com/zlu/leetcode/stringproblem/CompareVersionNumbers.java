package com.zlu.leetcode.stringproblem;

public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) { 
    	String[] nums1 = version1.split("\\.");
        String[] nums2= version2.split("\\.");
        int i = 0; 
        int j = 0;
        while(i != nums1.length && j != nums2.length){
        	int ans = Integer.parseInt(nums1[i++]) - Integer.parseInt(nums2[j++]);
        	if(ans > 0) return 1;
        	else if(ans < 0) return -1;
        }
       while(i != nums1.length) {
    	   if(Integer.parseInt(nums1[i++]) != 0)
    		   return 1;
       }
       while(j != nums2.length) {
    	   if(Integer.parseInt(nums2[j++]) != 0)
    		   return -1;
       }
       return 0;
    }
}
