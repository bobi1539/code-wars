package com.zero.kyu7;

public class LargestElements {

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        int[] largest = largest(2, arr);
        for(int i = 0; i < largest.length; i++){
            System.out.println(largest[i]);
        }
        //3,6,5,1,4

    }

    public static int[] largest(int n, int[] arr) {
        int arrLength = arr.length;
        for(int i = 0; i < arrLength; i++){
            for(int j = 0; j < arrLength; j++){
                if(j != arrLength - 1){
                    if(arr[j] > arr[j + 1]){
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
        }

        int[] result = new int[n];
        for(int i = n - 1; i >= 0; i--){
            result[i] = arr[arrLength - 1];
            arrLength--;
        }

        return result;
    }
}
