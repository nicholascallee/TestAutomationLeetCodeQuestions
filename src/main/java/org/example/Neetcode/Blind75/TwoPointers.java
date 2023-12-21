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

        for(int x =0; x < nums.length -2; x++){
            if(x > 0 && nums[x] == nums[x-1]){
                continue;
            }
            int left = x + 1;
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
                else if (0 > nums[x] + nums[left] + nums[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return returner;
    }


    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;
        int width;
        int shorterHeight;
        int heightLeft;
        int heightRight;
        while(left < right){
            width = right - left;
            heightLeft = height[left];
            heightRight = height[right];
            shorterHeight = Math.min(heightLeft,heightRight);
            if(shorterHeight * width > maxArea){
                maxArea = shorterHeight * width;
            }
            if(heightLeft > heightRight){
                right--;
            }
            else{
                left ++;
            }
        }
        return maxArea;
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int potentialProfit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                potentialProfit = prices[j] - prices[i];
                if(potentialProfit > maxProfit){
                    maxProfit = potentialProfit;
                }
            }
            if(prices[i] == 0){
                i = prices.length;
            }
        }
        return maxProfit;
    }

    public int maxProfitTwoPointersApproach(int[] prices) {
        int maxProfit = 0;
        return maxProfit;
    }
}
