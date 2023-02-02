package com.zero.kyu7;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(35254));

    }

    public static int sumOfDigits(int n) {
        String stringN = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < stringN.length(); i++){
            int intN = Integer.parseInt(String.valueOf(stringN.charAt(i)));
            sum += intN;
        }
        return sum;
    }
}
