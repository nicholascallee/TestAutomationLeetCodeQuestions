package org.example.Neetcode.Blind75;

public class ArraysAndHashing {
    public int[] TwoSum(int[] nums, int target){
        int[] returner = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] + nums[i] == target && i != j){
                    returner[0] = j;
                    returner[1] = i;
                    return returner;
                }
            }
        }
        return returner;
    }

    public Boolean ContainsDuplicate(int[] nums){
        return false;
    }
}
