package com.chethan.datastructures.backtracking;

import java.util.Arrays;

/**
 * Binary Permutations for size
 */
public class PermutationOfAnArray {
    static int[] arr;
    public static void main(String[] args) {
        int size = 3;
        arr = new int[size];
        permute(size);
    }

    private static void permute(int i) {
        if(i < 1 ) {
            System.out.println(Arrays.toString(arr));
        }else{
            arr[i - 1] = 1;
            permute(i - 1);
            arr[i - 1] = 0;
            permute(i - 1);
        }
    }
}
