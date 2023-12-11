package Neetcode.Blind75;

import org.example.Neetcode.Blind75.ArraysAndHashing;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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


        correct[0]= 0; correct[1] = 1;
        int[] inputer2 = new int[2];
        inputer2[0] = 3; inputer2[1] = 3;
        assertMe = mySolution.TwoSum(inputer2, 6);
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

        assertEquals( mySolution.ContainsDuplicate(input1),false);
        assertEquals( mySolution.ContainsDuplicate(input2),true);
        assertEquals( mySolution.ContainsDuplicate(input3),true);
        assertEquals( mySolution.ContainsDuplicate(input4),false);

    }

}
