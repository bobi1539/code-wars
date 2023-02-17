package com.zero.kyu7;

import java.util.HashSet;

public class Shifter {
    public static int count(String st){
        if(st.length() == 0){
            return 0;
        }
        int result = 0;

        String[] strings = st.split(" ");
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < strings.length; i++){
            set.add(strings[i]);
        }
        for(String s : set){
            if(isWordShifter(s)){
                result += 1;
            }
        }

        return result;
    }

    private static boolean isWordShifter(String word){
        String wordCanBeShifter = "HINOSXZWM";
        HashSet<Boolean> booleanHashSet = new HashSet<>();
        for(int i = 0; i < word.length(); i++){
            if(wordCanBeShifter.contains(String.valueOf(word.charAt(i)))){
                booleanHashSet.add(true);
            } else {
                booleanHashSet.add(false);
            }
        }
        if(booleanHashSet.size() == 1){
            Boolean[] booleans = booleanHashSet.toArray(booleanHashSet.toArray(new Boolean[1]));
            System.out.println(booleans[0]);
            return booleans[0];
        }
        return false;
    }
}
