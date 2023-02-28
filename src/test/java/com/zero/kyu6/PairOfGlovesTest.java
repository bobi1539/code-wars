package com.zero.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairOfGlovesTest {
    @Test
    void tests() {
        assertEquals(0, PairOfGloves.numberOfPairs(new String[] {}));
        assertEquals(1, PairOfGloves.numberOfPairs(new String[] {"red", "red"}));
        assertEquals(0, PairOfGloves.numberOfPairs(new String[] {"red", "green", "blue"}));
        assertEquals(3, PairOfGloves.numberOfPairs(new String[] {"gray", "black", "purple", "purple", "gray", "black"}));
        assertEquals(4, PairOfGloves.numberOfPairs(new String[] {"red", "green", "blue", "blue", "red", "green", "red", "red", "red"}));
    }
}
