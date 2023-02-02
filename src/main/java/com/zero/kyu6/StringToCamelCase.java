package com.zero.kyu6;

public class StringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-Stealth-Warrior"));
    }

    public static String toCamelCase(String s){
        if(s.isEmpty()){
            return "";
        }
        String newStr = s.replaceAll("[~!@#$%^&*()_+{}\\\\[\\\\]:;,.<>/?-]", ",").toLowerCase();
        StringBuilder sb = new StringBuilder();
        String[] strings = newStr.split(",");
        for(String s1 : strings){
            String res = s1.substring(0, 1).toUpperCase() + s1.substring(1);
            sb.append(res);
        }
        if(!s.substring(0,1).equals(sb.toString().substring(0,1))){
            String firstLetter = sb.toString().substring(0,1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(firstLetter.toLowerCase());
            sb2.append(sb.toString().substring(1));
            return sb2.toString();
        }
        return sb.toString();
    }
}
