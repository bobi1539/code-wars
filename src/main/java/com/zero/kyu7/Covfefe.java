package com.zero.kyu7;

public class Covfefe {

    public static void main(String[] args) {
        System.out.println(covfefe("coverage"));
        System.out.println(covfefe("coverage coverage"));
        System.out.println(covfefe("nothing"));
        System.out.println(covfefe("double space "));
        System.out.println(covfefe("covfefe"));
    }

    public static String covfefe(String tweet) {
        String s = "coverage";
        String s3 = "covfefe";
        String space = " ";
        String[] s1 = tweet.split(" ");
        StringBuilder sb = new StringBuilder();
        int s1Length = s1.length;
        for(int i = 0; i < s1Length; i++){
            if(s1[i].equalsIgnoreCase(s)){
                sb.append(s3);
            } else {
                sb.append(s1[i]);
            }
            if(i != s1Length - 1){
                sb.append(space);
            }
        }

        if(tweet.charAt(tweet.length() - 1) == ' '){
            sb.append(space);
        }

        if(!s1[s1.length - 1].equalsIgnoreCase(s)){
            if(!tweet.contains(s)){
                sb.append(space);
                sb.append(s3);
            }
        }
        return sb.toString();
    }
}
