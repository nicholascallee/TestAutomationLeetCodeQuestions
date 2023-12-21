package Neetcode.Blind75;

import org.example.Neetcode.Blind75.TwoPointers;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class TwoPointersTests {
    TwoPointers mySolution = new TwoPointers();

    @Test
    public void TwoPointersTestIsPalindrome() {
        assertTrue(mySolution.isPalindrome("racecar"));
        assertTrue(mySolution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(mySolution.isPalindrome("race a car"));
        assertTrue(mySolution.isPalindrome(" "));
    }
}
