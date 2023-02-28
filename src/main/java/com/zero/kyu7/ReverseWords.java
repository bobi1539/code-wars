package com.zero.kyu7;

public class ReverseWords {
    public static String reverseWords(final String original)
    {
        String[] arrayOriginal = original.split("\\ ");
        if(arrayOriginal.length == 0){
            return original;
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < arrayOriginal.length; i++){
            String[] split = arrayOriginal[i].split("");
            String reverseWord = "";
            for(int j = split.length - 1; j >= 0; j--){
                reverseWord += split[j];
            }
            result.append(reverseWord);
            if(i != arrayOriginal.length - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
