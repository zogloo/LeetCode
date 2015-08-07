package com.zlu.leetcode.arrayproblem;

//Moore��s Voting Algorithm
public class MajorityElement {
	public int majorityElement(int[] nums) {
        int majority = 0;
        int cnt = 0;
        for(int i=0; i< nums.length; i++){
            if ( cnt ==0 ){
                majority = nums[i];
                cnt++;
            }else{
                if(majority == nums[i])
                    cnt++ ;
                else cnt--;
                if (cnt >= nums.length/2+1) return majority;
            }
        }
        return majority;
    }
}
