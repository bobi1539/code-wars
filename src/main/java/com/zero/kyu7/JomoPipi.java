package com.zero.kyu7;

public class JomoPipi {
    public static int[] sequence(int x) {

        System.out.println("x : " + x);

        int[] arrayOfX = new int[x];
        String[] arrayOfXStr = new String[x];
        for(int i = 0; i < x; i++){
            arrayOfX[i] = i+1;
            arrayOfXStr[i] = String.valueOf(i+1);
        }

        if(x <= 9){
            return arrayOfX;
        }

        for(int i = 0; i < arrayOfXStr.length; i++){
            System.out.print(arrayOfXStr[i] + ",");
            if(i >= 9){
                int startWith = 1;
                int loop = 8;

                int index = i;
                String switchint = arrayOfXStr[index];
                swapData(arrayOfXStr, 1, i, 8, switchint, index);
                swapData(arrayOfXStr, 2, i, 7, switchint, index);
                swapData(arrayOfXStr, 3, i, 6, switchint, index);
                swapData(arrayOfXStr, 4, i, 5, switchint, index);
                swapData(arrayOfXStr, 5, i, 4, switchint, index);
                swapData(arrayOfXStr, 6, i, 3, switchint, index);
                swapData(arrayOfXStr, 7, i, 2, switchint, index);
                swapData(arrayOfXStr, 8, i, 1, switchint, index);

            }
        }

        System.out.println("");
        for(String s : arrayOfXStr){
            System.out.print(s + ",=");
        }

        for(int i = 0; i < arrayOfXStr.length; i++){
            arrayOfX[i] = Integer.parseInt(arrayOfXStr[i]);
        }
        return arrayOfX;
    }

    public static void swapData(String[] arrayOfXStr, int startWith, int i, int loop, String switchint, int index){
        if(arrayOfXStr[i].startsWith(String.valueOf(startWith))) {
            for (int j = 0; j < loop; j++) {
                arrayOfXStr[index] = arrayOfXStr[index - 1];
                arrayOfXStr[index - 1] = switchint;
                index--;
            }
        }
    }
}
