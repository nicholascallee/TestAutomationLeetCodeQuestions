package Neetcode.Blind75;

import org.example.Neetcode.Blind75.ArraysAndHashing;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static org.testng.Assert.assertEquals;

public class ArraysAndHashingTests {
    ArraysAndHashing mySolution = null;
//    Properties properties = null;
    @BeforeClass
    public void beforeClass() throws IOException {
        mySolution = new ArraysAndHashing();
//        properties = new Properties();
//        InputStream inputStream = getClass().getResourceAsStream("customTestingData.properties");
//        if (inputStream == null) {
//            throw new FileNotFoundException("customTestingData.properties not found");
//        }
//        properties.load(inputStream);
    }
    @Test
    public void ArraysAndHashingTestTwoSum() {
        //https://leetcode.com/problems/two-sum/description/

        // generate input values
        int[] inputer = new int[3];
        inputer[0] = 3; inputer[1] = 2; inputer[2] = 4;

        // generate the correct answer if target value is 6
        int[] correct = new int[2];
        correct[0]= 2; correct[1] = 1;

        //call the twoSum method with the input value and target value of 6
        int[] assertMe = mySolution.TwoSum(inputer, 6);
        assertEquals(
                assertMe[0] != correct[0] ? new int[]{assertMe[1], assertMe[0]} : assertMe,
                correct
        );

        // generate input values again
        int[] inputer2 = new int[2];
        inputer2[0] = 3; inputer2[1] = 3;

        // generate correct answer if target value is 6 again
        correct[0]= 0; correct[1] = 1;

        //call the twoSum method with the input value and target value of 6
        assertMe = mySolution.TwoSum(inputer2, 6);

        // assert that they are equal... even if the returned values are flipped.
        assertEquals(
                assertMe[0] != correct[0] ? new int[]{assertMe[1], assertMe[0]} : assertMe,
                correct
        );
    }

    @Test
    public void ArraysAndHashingTestContainsDuplicate() {
        int[] input1 = new int[]{1,2,3,1};
        int[] input2 = new int[]{1,2,3,4};
        int[] input3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        int[] input4 = new int[]{0};

        assertEquals( mySolution.ContainsDuplicate(input1),true);
        assertEquals( mySolution.ContainsDuplicate(input2),false);
        assertEquals( mySolution.ContainsDuplicate(input3),true);
        assertEquals( mySolution.ContainsDuplicate(input4),false);

    }

    @Test
    public void ArraysAndHashingTestIsAnagram() {
        assertEquals(mySolution.IsAnagram("anagram", "nagaram"), true);
        assertEquals(mySolution.IsAnagram("rat", "car"), false);
        assertEquals(mySolution.IsAnagram("anffagram", "nagaram"), false);
        assertEquals(mySolution.IsAnagram("r", "r"), true);
    }



    @Test
    public void ArraysAndHashingTestGroupAnagrams() {

        List<List<String>> actual = mySolution.GroupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("bat"));
        expected.add(Arrays.asList("nat", "tan"));
        expected.add(Arrays.asList("ate", "eat", "tea"));

        // Sort the inner lists
        actual.forEach(Collections::sort);
        expected.forEach(Collections::sort);

        // Sort the outer lists based on the contents of the first element
        actual.sort(Comparator.comparing(a -> a.get(0)));
        expected.sort(Comparator.comparing(a -> a.get(0)));

        assertEquals(expected, actual);
    }

    @Test
    public void ArraysAndHashingTestTopKFrequent() {
        int[] correctResult = new int[]{1,2};
        int[] result = mySolution.topKFrequent(new int[]{1,1,1,2,2,3},2);
        assertEquals(result,correctResult);

        int[] correctResult2 = new int[]{1};
        int[] result2 = mySolution.topKFrequent(new int[]{1},1);
        assertEquals(result2,correctResult2);
    }


    @Test
    public void ArraysAndHashingTestProductExceptSelf() {
        int[] result1 = mySolution.productExceptSelf(new int[]{1,2,3,4});
        int[] correctValues1 = new int[]{24,12,8,6};
        assertEquals(result1,correctValues1);

        int[] result2 = mySolution.productExceptSelf(new int[]{1,2,3,4});
        int[] correctValues2 = new int[]{24,12,8,6};
        assertEquals(result2,correctValues2);
    }

    @Test
    public void ArraysAndHashingTestLongestConsecutive() {
        int result1 = mySolution.longestConsecutive(new int[]{1, 2, 3, 4});
        int correctValue1 = 4;
        assertEquals(result1, correctValue1);


        int result2 = mySolution.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        int correctValue2 = 9;
        assertEquals(result2, correctValue2);
    }
}
