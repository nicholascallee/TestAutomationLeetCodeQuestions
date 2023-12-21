package org.example.Neetcode.Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointers {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if(s.length() < 2){
            return true;
        }
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindromeTwoPointersApproach(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() -1;
        while(left < right){
            if(s.charAt(right) != s.charAt(left)){
                return false;
            }
            right --;
            left ++;
        }
        return true;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> returner = new ArrayList<>();
        Arrays.sort(nums);

        for(int x =0; x < nums.length; x++){
            if(x > 0 && nums[x] == nums[x-1]){
                continue;
            }

            int left = 0;
            int right = nums.length -1;

            while(left < right){
                if(0 == nums[x] + nums[left] + nums[right]) {
                    returner.add(Arrays.asList(nums[x], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if (0 <= nums[x] + nums[left] + nums[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return returner;
    }
}
