package Neetcode.Blind75;

import org.example.Neetcode.Blind75.TwoPointers;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class TwoPointersTests {
    TwoPointers mySolution = new TwoPointers();

    @Test
    public void TwoPointersTestIsPalindrome() {
        //https://leetcode.com/problems/valid-palindrome/description/
        assertTrue(mySolution.isPalindrome("racecar"));
        assertTrue(mySolution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(mySolution.isPalindrome("race a car"));
        assertTrue(mySolution.isPalindrome(" "));
    }
    @Test
    public void TwoPointersTestIsPalindromeTwoPointersApproach() {
        //https://leetcode.com/problems/valid-palindrome/description/
        assertTrue(mySolution.isPalindromeTwoPointersApproach("racecar"));
        assertTrue(mySolution.isPalindromeTwoPointersApproach("A man, a plan, a canal: Panama"));
        assertFalse(mySolution.isPalindromeTwoPointersApproach("race a car"));
        assertTrue(mySolution.isPalindromeTwoPointersApproach(" "));
    }
    @Test
    public void TwoPointersTestThreeSum() {
        //https://leetcode.com/problems/3sum/description/
        List<List<Integer>> correctValue = new ArrayList<>();
        List<Integer> triplet1 = new ArrayList<>();
        List<Integer> triplet2 = new ArrayList<>();
        triplet1.add(-1);
        triplet1.add(-1);
        triplet1.add(2);
        correctValue.add(triplet1);
        triplet2.add(-1);
        triplet2.add(0);
        triplet2.add(1);
        correctValue.add(triplet2);

        List<List<Integer>> correctValue2 = new ArrayList<>();
        List<Integer> triplet3 = new ArrayList<>();
        triplet3.add(0);
        triplet3.add(0);
        triplet3.add(0);
        correctValue2.add(triplet3);

        List<List<Integer>> correctValue3 = new ArrayList<>();
        List<Integer> triplet4 = new ArrayList<>();
        triplet4.add(-1);
        triplet4.add(0);
        triplet4.add(1);
        correctValue3.add(triplet4);

        assertEquals(correctValue,mySolution.threeSum(new int[]{-1,0,1,2,-1,-4}));
        assertEquals(correctValue2,mySolution.threeSum(new int[]{0,0,0}));
        assertEquals(correctValue3,mySolution.threeSum(new int[]{1,-1,-1,0}));
    }

    @Test
    public void TwoPointersTestMaxArea() {
        //https://leetcode.com/problems/container-with-most-water/description/
        assertEquals(mySolution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}),49);
        assertEquals(mySolution.maxArea(new int[]{1,1}),1);
    }
    @Test
    public void TwoPointersTestMaxProfit() {
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
        assertEquals(mySolution.maxProfit(new int[]{7,1,5,3,6,4}),5);
        assertEquals(mySolution.maxProfit(new int[]{7,6,4,3,1}),0);
    }
    @Test
    public void TwoPointersTestMaxProfitTwoPointersApproach() {
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
        assertEquals(mySolution.maxProfitTwoPointersApproach(new int[]{7,1,5,3,6,4}),5);
        assertEquals(mySolution.maxProfitTwoPointersApproach(new int[]{7,6,4,3,1}),0);
    }



}
