package com.zero.kyu6;

public class WhoLikeIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("ucup", "budi", "tono", "andi", "joko"));
    }

    public static String whoLikesIt(String... names) {
        String noOne = "no one likes this";
        String likesThis = " likes this";
        String likeThis = " like this";
        String and = " and ";
        String coma = ", ";
        String othersStr = " others";

        int others = 0;
        if(names.length > 3){
            others = names.length - 2;
        }

        String[] nameArr = names;
        switch (names.length){
            case 0 : return noOne;
            case 1 : return nameArr[0] + likesThis;
            case 2 : return nameArr[0] + and + nameArr[1] + likeThis;
            case 3 : return nameArr[0] + coma + nameArr[1] + and + nameArr[2] + likeThis;
        }

        return nameArr[0] + coma + nameArr[1] + and + others + othersStr + likeThis;
    }
}
