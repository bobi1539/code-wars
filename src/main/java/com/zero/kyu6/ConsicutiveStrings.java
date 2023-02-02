package com.zero.kyu6;

public class ConsicutiveStrings {
    public static void main(String[] args) {
        String[] strarr = {"tono1", "ucup123", "and5", "mario1", "budi239"};
        System.out.println(longestConsec(strarr, 89));
        System.out.println(longestConsec(new String []{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));

    }

    public static String longestConsec(String[] strarr, int k) {
        String result = "";
        if(k <= 0 || k > strarr.length){
            return result;
        }

        String[] newarr = new String[strarr.length];
        int index = 0;
        for(int i = 0; i < strarr.length; i++){
            StringBuilder sb = new StringBuilder();
            int indexToAppend = index;
            for(int j = 0; j < k; j++){
                if(indexToAppend != strarr.length) {
                    sb.append(strarr[indexToAppend]);
                    indexToAppend += 1;
                }
            }
            index += 1;
            newarr[i] = sb.toString();
        }
        int max = 0;
        for(int i = 0; i < newarr.length; i++){
            if(newarr[i].length() > max){
                max = newarr[i].length();
            }
        }

        for(String s : newarr){
            if(s.length() == max){
                result = s;
                break;
            }
        }
        return result;
    }

    public static String checkString(){
        String[] tes = {"ucup", "ucup123", "ucup1234", "ucup1256"};
        int max = 8;
        for(int i = 0; i < tes.length; i++){
            if(tes[i].length() == max){
                return tes[i];
            }
        }
        return "";
    }
}
