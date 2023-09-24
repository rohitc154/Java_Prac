package com.Javadsa;

import java.util.Arrays;

public class ArrayInsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
