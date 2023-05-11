package fr.codeonce.lambda.lambda;

import java.util.Arrays;
import java.util.List;

public class RepeatedCharCounter {

    public int countOccurrences(String text, String word) {
        List<String> words = Arrays.asList(text.split(" "));
        return (int) words.stream()
                .filter(w -> w.equals(word))
                .count();
    }
    
}
