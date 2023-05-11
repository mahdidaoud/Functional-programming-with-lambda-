package fr.codeonce.lambda.lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RepeatedCharCounterTest {


    private final RepeatedCharCounter repeatedCharCounter = new RepeatedCharCounter();

    @Test
    public void testCountOccurrences() {
        String text = "Operator can create a store for the provider";
        String word = "can";
        int result = repeatedCharCounter.countOccurrences(text, word);
        assertEquals(1, result);
    }
    
}
