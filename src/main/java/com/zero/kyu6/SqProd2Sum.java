package com.zero.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SqProd2Sum {
    public static List<long[]> prod2Sum(long a, long b, long c, long d) {

        //2,3,4,5
        //13, 41
        //533
        //1,1,3,5
        //2, 34 = 68 = 64 + 4 = 2, 8
        long e = (a * a) + (b * b);
        long f = (c * c) + (d * d);
        long n = e * f;

        long sqrt1 = (long) Math.floor(Math.sqrt(n));
        long pow = sqrt1 * sqrt1;
        long diff = n - pow;
        long sqrt2 = (long) Math.sqrt(diff);

        long[] result1 = {sqrt2, sqrt1};

        long[] temp = new long[(int) sqrt1];
        for(long i = 0; i < sqrt1; i++){
            temp[(int)i] = (i+1);
        }

        long[] result2 = new long[2];
        for(int i = 0; i < temp.length; i++){
            long y = temp[i];
            long x = y * y;
            if(x + x == (int) n){
                result2[0] = y;
                result2[1] = y;
            } else {
                for (int j = 1; j <= temp.length - 1; j++) {
                    if (i != temp.length - 1) {
                        long z = temp[j];
                        long k = z * z;
                        if (x + k == (int) n) {
                            result2[0] = z;
                            result2[1] = y;
                        }
                    }
                }
            }
        }

        if(result2[0] == result1[1] || result2[1] == result1[0]){
            result2[0] = 0;
            result2[1] = 0;
        }

        List<long[]> result = new ArrayList<>();
        if (e >= 0 && f >= 0) {
            if (result1[0] > 0 && result1[1] > 0) {
                result.add(result1);
            }
            if (result2[0] > 0 && result2[1] > 0) {
                result.add(result2);
            }
        }
        //19,19,5,136
        if(result.size() == 1){
            System.out.println("result final 0 : " + Arrays.toString(result.get(0)));
        }
        if(result.size() == 2){
            System.out.println("result final 0 : " + Arrays.toString(result.get(0)));
            System.out.println("result final 1 : " + Arrays.toString(result.get(1)));
        }
        System.out.println("abcd : " + a + "," + b + "," + c + "," + d);
        System.out.println("result 1-0 : " + result1[0]);
        System.out.println("result 1-1 : " + result1[1]);
        System.out.println("result 2-0 : " + result2[0]);
        System.out.println("result 2-1 : " + result2[1]);

        System.out.println("len result : " + result.size());
        return result;
    }
}
