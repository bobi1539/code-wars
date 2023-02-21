package com.zero.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaporatorTest {
    @Test
    public void testEvaporatorOne() {
        assertEquals(22 , Evaporator.evaporator(10, 10, 10));
        assertEquals(29 , Evaporator.evaporator(10, 10, 5));
    }
}
