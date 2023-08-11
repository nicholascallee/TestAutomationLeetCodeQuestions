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
        inputer[0] = 3; inputer[1] = 2; inputer[2] = 4;
        System.out.println(Arrays.toString(mySolution.twoSum(inputer, 6)));
    }

}
