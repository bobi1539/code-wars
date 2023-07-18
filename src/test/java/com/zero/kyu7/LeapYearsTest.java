package com.zero.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearsTest {

    @Test
    void testIsLeapYears() {
        assertTrue(LeapYears.isLeapYear(2020));
        assertFalse(LeapYears.isLeapYear(2015));
        assertFalse(LeapYears.isLeapYear(2100));
    }

}