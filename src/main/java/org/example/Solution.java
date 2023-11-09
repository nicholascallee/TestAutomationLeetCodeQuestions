package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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

    HashMap<String,Boolean> remember = new HashMap<>();
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        int longest = 1;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length(); j++) {
                String currentSubstring = s.substring(i,j+1);
                if(!containsRepeatingVals(currentSubstring)){
                    int substringLength = currentSubstring.length();
                    if(substringLength > longest){
                        longest = substringLength;
                    }
                }
                else{
                    // if the substring does contain repeating values then bump i up to j and make j big enough to stop the loop
                    //i actually needs to go to the index of the first occurrence of the duplicated letter.
                    i = currentSubstring.indexOf(currentSubstring.charAt(currentSubstring.length()-1))+ i;
                    j = s.length();
                }
            }
        }
        return longest;
    }

    public boolean containsRepeatingVals(String stringVal){
        if(remember.containsKey(stringVal)){
            return remember.get(stringVal);
        }
        Set<Character> charSet = new HashSet<>();
        for (char c : stringVal.toCharArray()) {
            if (charSet.contains(c)) {
                remember.put(stringVal,true);
                return true;
            }
            charSet.add(c);
        }
        remember.put(stringVal,false);
        return false;
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


    public double myPow(double x, int n) {
        double returner = x;
        if(n == 0){
            return 1;
        }
        for(int z = 1;z < Math.abs(n);z++){
            returner = returner * x;
        }
        if(n < 0){
            returner = 1 / returner;
        }
        return returner;
    }


    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String xString = Integer.toString(x);
        int xStringLength = xString.length();
        for(int i = 0; i < xStringLength/2; i++){
            if(xString.charAt(i) != xString.charAt(xStringLength-1-i)){
                return false;
            }
        }
        return true;
    }


    public int lengthOfLastWord(String s) {
        String[] splitValues = s.split(" ");
        return splitValues[splitValues.length-1].length();
    }


    public int reverse(int x) {
        boolean negitive = false;
        String myInt = Integer.toString(x);
        if(myInt.charAt(0) == '-'){
            myInt = myInt.substring(1);
            negitive = true;
        }
        StringBuilder reversed = new StringBuilder(myInt);
        reversed.reverse();
        try{
            int reversedValue = Integer.parseInt(reversed.toString());
            if(negitive){
                return -reversedValue;
            }
            return reversedValue;
        }
        catch(Exception e){
            return 0;
        }
    }

    public int maxProfit2(int[] prices) {
        //if min of prices is before max of prices, return  max - min
        // else
        //remove the max and call maxProfit again.

        int min = 99999999;
        int minIdx = 0;
        int max = 0;
        int maxIdx = 0;
        int count = 0;
        for(int price: prices){
            if (price > max){
                max = price;
                maxIdx = count;
            }
            if (price < min){
                min = price;
                minIdx = count;
            }
            count++;
        }
        if (minIdx < maxIdx){
            return max - min;
        }
        else{
            int[] newPrices = removeTheElement(prices,maxIdx);
            return maxProfit2(newPrices);
        }
    }

    public static int[] removeTheElement(int[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }


    public int removeElement(int[] nums, int val) {
        int newIndexBuilder = 0;
        for(int x = 0; x < nums.length; x++){
            if (nums[x] != val){
                nums[newIndexBuilder] = nums[x];
                newIndexBuilder += 1;
            }
        }
        return newIndexBuilder;
    }


    public int climbStairs(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }


}