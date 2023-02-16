package com.zero.kyu6;

import java.math.BigInteger;

public class SumTheSum {
    public static void main(String[] args) {
        System.out.println(sumOfSums(3));
        System.out.println(sumOfSums(5));
        System.out.println(sumOfSums(1000));
    }

    public static BigInteger sumOfSums(int n)
    {
        int[] arrInt = new int[n];
        for(int i = 0; i < n; i++){
            int number = i + 1;
            arrInt[i] = number;
        }

        int nArrZ = 0;
        for(int i = 0; i < n; i++){
            int nj = i + 1;
            int add = 0;
            for(int j = 0; j < nj; j++){
                add += arrInt[j];
            }
            nArrZ += add;
        }

        Long toAdd = Long.valueOf(nArrZ);
        BigInteger result = BigInteger.ZERO;
        for(BigInteger bi = BigInteger.valueOf(toAdd); bi.compareTo(BigInteger.ZERO) > 0; bi = bi.subtract(BigInteger.ONE)){
            result = result.add(bi);
        }
        return result;
    }
}
