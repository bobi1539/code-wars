package com.zero.kyu6;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {

        String stringOfNumber = String.valueOf(number);
        int root = stringOfNumber.length();
        int[] arrayOfNumber = new int[root];
        int sumOfNumberRoot = 0;

        for(int i = 0; i < root; i++){
            arrayOfNumber[i] = Integer.parseInt(String.valueOf(stringOfNumber.charAt(i)));
            double pow = Math.pow(arrayOfNumber[i], root);
            sumOfNumberRoot += pow;
        }

        return sumOfNumberRoot == number;
    }
}
