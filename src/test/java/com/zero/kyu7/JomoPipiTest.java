package com.zero.kyu7;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JomoPipiTest {
    @Test
    public void test0() {
        int[] result = {1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 16;
        String expected = Arrays.toString(result),
                actual = Arrays.toString(JomoPipi.sequence(x));
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 9;
        String expected = Arrays.toString(result),
                actual = Arrays.toString(JomoPipi.sequence(x));
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] result = {1, 10, 11, 12, 13, 14, 15, 16,17,18,19, 2,20, 21, 22, 23, 24, 3, 4, 5, 6, 7, 8, 9};
        int x = 24;
        String expected = Arrays.toString(result),
                actual = Arrays.toString(JomoPipi.sequence(x));
        assertEquals(expected, actual);
    }
}
