package com.chethan.datastructures.backtracking;

import java.util.Arrays;

// Generate all the strings of length n drawn from 0... k – 1.
public class StringsOfKLength {
    static int[] arr;
    public static void main(String[] args) {
        int k = 4;
        int n = 3;
        arr = new int[k];
        kString(n, k);
    }

    private static void kString(int n, int k) {
        if(n < 1){
            System.out.println(Arrays.toString(arr));
        }else{
            for(int i = 0; i < k; i++){
                arr[n-1] = i;
                kString(n-1, k);
            }
        }
    }
}
