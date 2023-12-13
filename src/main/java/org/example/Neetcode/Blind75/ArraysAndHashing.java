package org.example.Neetcode.Blind75;

import java.util.*;

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


    public Boolean IsAnagram(String s, String t){

        if (s.length() != t.length())
        {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            if(sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            }
            else{
            sMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++)
        {
            if(tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }
            else{
                tMap.put(t.charAt(i), 1);
            }
        }

        if (sMap.size() != tMap.size()) {
            return false;
        } else {
            for (Map.Entry<Character, Integer> entry : tMap.entrySet()) {
                char key = entry.getKey();
                int value = entry.getValue();

                if (!sMap.containsKey(key) || !sMap.get(key).equals(value)) {
                    return false;
                }
            }
        }
        return true;
    }
    public List<List<String>> GroupAnagrams(String[] strs) {
        // change the value type of the map to a list of strings and directly add that value. then u can return them easier
        Map<String, String[]> distinctAnagramCounts = new HashMap<>();

        //iterate through the strings
        for(String string: strs){
            //sort the string
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            //add it to a hashmap
            if(distinctAnagramCounts.containsKey(sortedString)){
                String[] newArray = Arrays.copyOf(distinctAnagramCounts.get(sortedString), distinctAnagramCounts.get(sortedString).length + 1);
                newArray[distinctAnagramCounts.get(sortedString).length] = string;
                distinctAnagramCounts.put(sortedString, newArray);
            }
            else {
                distinctAnagramCounts.put(sortedString,new String[]{string});
            }
        }
        //return a list of lists of strings from the values of all keys in the hashmap
        List<List<String>> valuesList = new ArrayList<>();

        // Loop through the map and add the values to the list of lists
        for (String[] values : distinctAnagramCounts.values()) {
            List<String> innerList = new ArrayList<>(List.of(values));
            valuesList.add(innerList);
        }
        return valuesList;
    }


    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberCounts = new HashMap<>();
        for(int num :nums){
            if(numberCounts.containsKey(num)){
                numberCounts.put(num, numberCounts.get(num) + 1);
            }
            else{
                numberCounts.put(num,1);
            }
        }
        // go through hashmap and find the top k occuring values

    }
}
