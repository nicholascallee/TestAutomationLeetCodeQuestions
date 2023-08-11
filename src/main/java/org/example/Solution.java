package org.example;

import java.util.HashMap;
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        if (word1.length() == 1 && word2.length() == 1){
            return word1 + word2;
        }

        if(word1.length() > word2.length()){
            return mergeAlternately(word1.substring(0,word2.length()), word2) + word1.substring(word2.length());
        }

        if(word2.length() > word1.length()){
            return mergeAlternately(word1, word2.substring(0,word1.length())) + word2.substring(word1.length());
        }

        if(word1.length() == 2){
            return word1.substring(0,1) + word2.charAt(0) +word1.charAt(1) + word2.charAt(1);
        }

        if(word1.length() > 2){
            return word1.substring(0,1) + word2.charAt(0) +word1.charAt(1) + word2.charAt(1) + mergeAlternately(word1.substring(2),word2.substring(2));
        }
        return null;
    }

    public char findTheDifference(String s, String t) {

        String temp = t;
        for(int i = 0; i< s.length();i++){
            // Find the index of the first occurrence of the character
            int indexOfCharToRemove = temp.indexOf(s.substring(i,i+1));

            // Check if the character was found
            if (indexOfCharToRemove != -1) {
                // Remove the first occurrence of the character
                temp = temp.substring(0, indexOfCharToRemove) +
                        temp.substring(indexOfCharToRemove + 1);
            }
        }
        return temp.charAt(0);
    }

    public int[] twoSum(int[] nums, int target){
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

}