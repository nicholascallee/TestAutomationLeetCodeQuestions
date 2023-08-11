package org.example;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        Solution mySolution = new Solution();
        
        int[] inputer = new int[3];
        inputer[0] = 3;
        inputer[1] = 2;
        inputer[2] = 4;
        System.out.println(Arrays.toString(mySolution.twoSum(inputer, 6)));
        int[] inputer2 = new int[2];
        inputer2[0] = 3; inputer2[1] = 3;
        System.out.println(Arrays.toString(mySolution.twoSum(inputer2, 6)));
    }
}