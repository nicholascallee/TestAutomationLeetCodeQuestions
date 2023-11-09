import org.example.Solution;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.testng.Assert.assertEquals;

public class LeetCodeTests{
    Solution mySolution = null;
    Properties properties = null;

    @BeforeClass
    public void beforeClass() throws IOException {
        mySolution = new Solution();
        properties = new Properties();
        InputStream inputStream = getClass().getResourceAsStream("customTestingData.properties");
        properties.load(inputStream);

    }

    @Test
    public void LeetCodeTestMergeAlternately(){
        assertEquals(mySolution.mergeAlternately("abc", "pqr"),"apbqcr");
        assertEquals(mySolution.mergeAlternately("ab", "pqrs"),"apbqrs");
    }

    @Test
    public void LeetCodeTestFindTheDifference() {
        assertEquals(mySolution.findTheDifference("abcd", "abcde"),'e');
        assertEquals(mySolution.findTheDifference("", "y"),'y');
        assertEquals(mySolution.findTheDifference("a", "aa"), 'a');
    }

    @Test
    public void LeetCodeTestTwoSum() {
        //https://leetcode.com/problems/two-sum/description/

        int[] inputer = new int[3];
        int[] correct = new int[2];
        correct[0]= 2; correct[1] = 1;
        inputer[0] = 3; inputer[1] = 2; inputer[2] = 4;
        int[] assertMe = mySolution.twoSum(inputer, 6);
        if(assertMe[0] != correct[0]){
            int tmp = assertMe[0];
            assertMe[0] = assertMe[1];
            assertMe[1] = tmp;
        }
        assertEquals(assertMe, correct);

        correct[0]= 0; correct[1] = 1;
        int[] inputer2 = new int[2];
        inputer2[0] = 3; inputer2[1] = 3;
        assertMe = mySolution.twoSum(inputer2, 6);
        if(assertMe[0] != correct[0]){
            int tmp = assertMe[0];
            assertMe[0] = assertMe[1];
            assertMe[1] = tmp;
        }
        assertEquals(assertMe,correct);
    }

    @Test
    public void LeetCodeTestLengthOfLongestSubstring() {
        //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

        assertEquals(mySolution.lengthOfLongestSubstring("abcabcbb"),3);
        assertEquals(mySolution.lengthOfLongestSubstring("bbbbb"),1);
        assertEquals(mySolution.lengthOfLongestSubstring("pwwkew"), 3);
        assertEquals(mySolution.lengthOfLongestSubstring("aab"), 2);
        assertEquals(mySolution.lengthOfLongestSubstring("dvdf"), 3);
        assertEquals(mySolution.lengthOfLongestSubstring(properties.getProperty("lengthOfLongestSubstringLargeTest")), 95);
    }

    @Test
    public void LeetCodeTestBestTimeToBuyAndSellStock() throws IOException {
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

        int[] testingArray = {7, 1, 5, 3, 6, 4};
        assertEquals(mySolution.maxProfit(testingArray),5);

        testingArray = new int[]{7, 6, 4, 3, 1};
        assertEquals(mySolution.maxProfit(testingArray),0);

        String[] numberStrings = properties.getProperty("maxProfitLargeTest").split(",");
        int[] intArray = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            intArray[i] = Integer.parseInt(numberStrings[i]);
        }
        assertEquals(mySolution.maxProfit(intArray),999);
    }

    @Test
    public void LeetCodeTestPow() throws IOException {
        //https://leetcode.com/problems/powx-n/

        assertEquals(mySolution.myPow(2, -2), .25);
        assertEquals(mySolution.myPow(2, 10), 1024);
        //TODO: Fix this test
        assertEquals(mySolution.myPow(2, -2147483648), 0);
        assertEquals(mySolution.myPow(34.00515, -3), 0.00003);
        assertEquals(mySolution.myPow(0.44528, 0), 1);

    }

    @Test
    public void LeetCodeTestIsPalindrome(){
        //https://leetcode.com/problems/palindrome-number/
        assertEquals(mySolution.isPalindrome(121), true);
        assertEquals(mySolution.isPalindrome(-121), false);
        assertEquals(mySolution.isPalindrome(10), false);
        assertEquals(mySolution.isPalindrome(-101), false);
    }


    @Test
    public void LeetCodeTestLengthOfLastWord(){
        assertEquals(mySolution.lengthOfLastWord("Hello World"), 5);
        assertEquals(mySolution.lengthOfLastWord("   fly me   to   the moon  "),4);
        assertEquals(mySolution.lengthOfLastWord("luffy is still joyboy"), 6);
    }

    @Test
    public void LeetCodeTestReverseInteger(){
        assertEquals(mySolution.reverse(123),321);
        assertEquals(mySolution.reverse(-123),-321);
        assertEquals(mySolution.reverse(120),21);
    }

    @Test
   public void LeetCodeTestMaxProfit2(){
        int[] test1 =  {7,1,5,3,6,4};
        assertEquals(mySolution.maxProfit2(test1),5);
    }



    @Test
    public void LeetCodeTestRemoveElement(){
        int[] test1 = {0,1,2,2,3,0,4,2};
        int[] test2 = {3,2,2,3};
        assertEquals(mySolution.removeElement(test1,2),5);
        assertEquals(mySolution.removeElement(test2,3),2);
    }


    @Test
    public void LeetCodeTestClimbStairs(){
        assertEquals(mySolution.climbStairs(3),3);
        assertEquals(mySolution.climbStairs(15),987);
        assertEquals(mySolution.climbStairs(32),3524578);
        assertEquals(mySolution.climbStairs(45),1836311903);
    }

}
