package com.zero.kyu7;

public class SumofCubes {

    public static void main(String[] args) {

        System.out.println(sumCubes(123));
    }

    public static long sumCubes(long n)
    {
        //put your code here :D
        long result = 0L;
        for(int i = 1; i <= n; i++){
            result += (long)Math.pow(i, 3);
        }
        return result;
    }

}
