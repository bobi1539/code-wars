package com.zero.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest {
    @Test
    public void testGcd() {
//        assertEquals(15, GCD.compute(30,15));
        assertEquals(6, GCD.compute(30,12));
        assertEquals(6, GCD.compute(30,12));
//        assertEquals(1, GCD.compute(8,9));
//        assertEquals(1, GCD.compute(1,1));
    }
}
