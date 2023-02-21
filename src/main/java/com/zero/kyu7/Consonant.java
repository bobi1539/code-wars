package com.zero.kyu7;

import java.util.Date;

public class Consonant {
    public static void main(String[] args) {
        System.out.println(getCount(""));
        System.out.println(getCount("aaaaa"));
        System.out.println(getCount("XaeiouX"));
        System.out.println(getCount("Bbbbb"));
        System.out.println(getCount("helLo world"));
        System.out.println(getCount("h^$&^#$&^elLo world"));
        System.out.println(getCount("123_cb"));

        Date date = new Date();
    }

    public static int getCount(String str) {
        str = str.toLowerCase().replaceAll("[^\\dA-Za-z]", "").replace(" ", "")
                .replaceAll("[0-9]", "");
        if (str.length() == 0){
            return 0;
        }

        int result = 0;
        char[] vowels = {'a', 'i', 'u', 'e', 'o'};
        for(int i = 0; i < str.length(); i++){
            boolean isVowel = false;
            for(int j = 0; j < vowels.length; j++){
                if(str.charAt(i) == vowels[j]){
                    isVowel = true;
                }
            }
            if(!isVowel){
                result += 1;
            }
        }

        return result;
    }
}
