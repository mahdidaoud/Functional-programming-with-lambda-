package fr.codeonce.lambda.lambda;

import java.util.stream.IntStream;

public class Palindrome {

    public boolean isPalindrome(String text) {

        return IntStream.range(0, text.length() / 2)
                .noneMatch(i -> text.charAt(i) != text.charAt(text.length() - i - 1));
    }
    
}
