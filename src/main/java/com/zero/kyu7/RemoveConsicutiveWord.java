package com.zero.kyu7;

import java.util.HashSet;

public class RemoveConsicutiveWord {
    public static String removeConsecutiveDuplicates(String s){
        if(s.length() == 1) return s;

        HashSet<String> hashSet = new HashSet<>();

        String[] arrayOfStringInput = s.split("\\ ");
        for(String str : arrayOfStringInput){
            hashSet.add(str);
        }

        StringBuilder builder = new StringBuilder();
        Object[] objects = hashSet.stream().toArray();
        for(int i = 0; i < objects.length; i++){
            builder.append(objects[i].toString());
            if(i != objects.length - 1){
                builder.append(" ");
            }
        }

        return builder.toString();
    }
}
