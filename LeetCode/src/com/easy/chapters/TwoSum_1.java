package com.easy.chapters;

import com.sun.accessibility.internal.resources.accessibility;

public class TwoSum_1 {
	public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for(int i = 0;i < nums.length - 1; i ++){
            for(int j = 0;j < nums.length - 1 - i; j ++){
                if(nums[i] + nums[j] == target){
                    a[0] = i;
                    a[1] = j;
                    
                }
            }
        }
        return a;
    }
}
