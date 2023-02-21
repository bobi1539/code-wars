package com.zero.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThinkingAndTestingTest {
    @Test
    public void exampleSumTests() {
        // a + b?
        assertEquals(1, ThinkingAndTesting.testAB(0, 1));
        assertEquals(3, ThinkingAndTesting.testAB(1, 2));
        assertEquals(30, ThinkingAndTesting.testAB(10, 20));
        assertEquals(879, ThinkingAndTesting.testAB(588, 879));
        assertEquals(998, ThinkingAndTesting.testAB(962, 740));
    }

    @Test
    public void exampleProductTests() {
        // a * b?
        assertEquals(1, ThinkingAndTesting.testAB(1, 1));
        assertEquals(3, ThinkingAndTesting.testAB(1, 3));
    }
}
