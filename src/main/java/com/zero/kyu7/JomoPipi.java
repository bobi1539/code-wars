package com.zero.kyu7;

public class JomoPipi {
    public static int[] sequence(int x) {

        int[] numbers = new int[9];
        for(int i = 0; i < 9; i++){
            numbers[i] = i + 1;
            System.out.print(numbers[i] + ",");
        }

        String[] strings = new String[x];
        for(int i = 1; i <= x; i++){
            strings[i - 1] = String.valueOf(i);
        }

        int[] ints = new int[x];
        for (int i = 1; i <= 9; i++) {
            if(i <= 9) {
                ints[i - 1] = i;
            }
        }
        return ints;
    }
}
