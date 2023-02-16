package com.zero.other;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,7,4,9,3,6,8,5};
        //[2,1,4,3]5[7,9,6,8]
        //[2,1]3[4]5[7,6]8[9]
        quickSort(arr);
    }

    public static int[] quickSort(int[] arr){
        int len = arr.length;
        int mid = arr[len - 1];
        int[] left = new int[4];
        int[] mids = new int[1];
        int[] right = new int[4];
        int iLeft = 0;
        int iRight = 0;

        int[] newArr = new int[len];
        for(int i = 0; i < len; i++){
            int tmp = arr[i];
            if(arr[i] < mid){
                
            }
        }


        return null;
    }
}
