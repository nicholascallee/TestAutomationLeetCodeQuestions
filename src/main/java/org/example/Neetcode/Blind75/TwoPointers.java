package org.example.Neetcode.Blind75;

public class TwoPointers {

    public boolean isPalindrome(String s) {
        int xStringLength = s.length();
        for(int i = 0; i < xStringLength/2; i++){
            if(s.charAt(i) != s.charAt(xStringLength-1-i)){
                return false;
            }
        }
        return true;
    }
}
