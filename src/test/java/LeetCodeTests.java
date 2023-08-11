import org.example.Solution;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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

}
