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
    }

    @Test
    public void exampleProductTests() {
        // a * b?
        assertEquals(1, ThinkingAndTesting.testAB(1, 1));
        assertEquals(3, ThinkingAndTesting.testAB(1, 3));
        assertEquals(497, ThinkingAndTesting.testAB(113, 464));
    }
}
