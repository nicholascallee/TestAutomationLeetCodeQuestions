package org.example.Neetcode.Blind75;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

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
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }
        return false;
    }
}
