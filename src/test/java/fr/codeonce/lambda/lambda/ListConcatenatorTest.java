package fr.codeonce.lambda.lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListConcatenatorTest {

    @Test
    public void testConcat() {
        List<String> l1 = new ArrayList<>(Arrays.asList("mahdi", "daoud"));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(123, 456));
        ListConcatenator concatenator = new ListConcatenator();
        List<String> result = concatenator.concat(l1, l2);
        List<String> expected = new ArrayList<>(Arrays.asList("mahdi", "daoud", "123", "456"));
        assertEquals(expected, result);
    }
    
}
