package fr.codeonce.lambda.lambda;


public class RepeatedCharFinder {
    public char findFirstNonRepeatedChar(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst()
                .orElse('\0'); 
    }
}
