package com.zero.kyu6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqProd2SumTest {
    @Test
    public void test0() {
        List<long[]> exp = new ArrayList<long[]>();
        long[] cc = new long[] {1, 7};
        exp.add(cc);
        long[] dd = new long[] {5, 5};
        exp.add(dd);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(1, 2, 1, 3).get(0));
        assertArrayEquals(exp.get(1), SqProd2Sum.prod2Sum(1, 2, 1, 3).get(1));

        exp = new ArrayList<long[]>();
        cc = new long[] {2, 23};
        exp.add(cc);
        dd = new long[] {7, 22};
        exp.add(dd);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(2, 3, 4, 5).get(0));
        assertArrayEquals(exp.get(1), SqProd2Sum.prod2Sum(2, 3, 4, 5).get(1));

        exp = new ArrayList<long[]>();
        cc = new long[] {2, 8};
        exp.add(cc);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(1, 1, 3, 5).get(0));

        exp = new ArrayList<long[]>();
        cc = new long[] {58, 1740};
        exp.add(cc);
        dd = new long[] {410, 1692};
        exp.add(dd);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(4,10,65,148).get(0));
        assertArrayEquals(exp.get(1), SqProd2Sum.prod2Sum(4,10,65,148).get(1));

        exp = new ArrayList<long[]>();
        cc = new long[] {124, 12103};
        exp.add(cc);
        dd = new long[] {2037, 11931};
        exp.add(dd);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(84,27,97,97).get(0));
        assertArrayEquals(exp.get(1), SqProd2Sum.prod2Sum(84,27,97,97).get(1));
        assertEquals(2, SqProd2Sum.prod2Sum(84,27,97,97).size());


        exp = new ArrayList<long[]>();
        dd = new long[] {5600, 19200};
        exp.add(dd);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(100, 100, 100, 100).get(0));


    }
}
