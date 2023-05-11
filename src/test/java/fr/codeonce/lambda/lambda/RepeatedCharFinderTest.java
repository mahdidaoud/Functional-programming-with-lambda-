package fr.codeonce.lambda.lambda;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedCharFinderTest {


    @Test
    public void testFindFirstNonRepeatedChar() {
        RepeatedCharFinder finder = new RepeatedCharFinder();

        assertEquals('t', finder.findFirstNonRepeatedChar("stress"));
        assertEquals('o', finder.findFirstNonRepeatedChar("ovale"));
    }
    
}
