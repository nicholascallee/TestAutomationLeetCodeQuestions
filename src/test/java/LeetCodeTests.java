import org.example.Solution;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class LeetCodeTests{
    Solution mySolution = null;

    @BeforeClass
    public void beforeClass(){
        mySolution = new Solution();
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
        int[] inputer = new int[3];
        int[] correct = new int[2];
        correct[0]= 2; correct[1] = 1;
        inputer[0] = 3; inputer[1] = 2; inputer[2] = 4;
        assertEquals(mySolution.twoSum(inputer, 6), correct);
        correct[0]= 0; correct[1] = 1;
        int[] inputer2 = new int[2];
        inputer2[0] = 3; inputer2[1] = 3;
        assertEquals(mySolution.twoSum(inputer2, 6),correct);

    }

}
