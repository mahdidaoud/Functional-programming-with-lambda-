package fr.codeonce.lambda.lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

       @Test
    public void testIsPalindrome() {
        Palindrome checker = new Palindrome();
        assertEquals(true, checker.isPalindrome("MahdiidhaM"));
        assertEquals(false, checker.isPalindrome("test"));
    }
    
}
