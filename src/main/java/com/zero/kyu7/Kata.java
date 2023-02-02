package com.zero.kyu7;

import java.util.function.UnaryOperator;

public class Kata {

    public static int[] arrayField;

    public static Kata multiplyAll(int[] array) {
        arrayField = array;
        return new Kata();
    }

    public int[] apply(int x){
        int[] result = new int[arrayField.length];
        for(int i = 0; i < arrayField.length; i++){
            result[i] = arrayField[i] * x;
            System.out.println(result[i]);
        }
        return result;
    }

    public String str(){
        return "str";
    }

    static UnaryOperator<Integer> magic() {
        UnaryOperator<Integer> x = new UnaryOperator<Integer>(){
            @Override
            public Integer apply(Integer integer) {
                return integer * 42;
            }
        };
        return x;

    }

//    public static int apply(int n){
//        return n;
//    }
}
