package com.Javadsa;

import java.util.Arrays;

public class ArrayCyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 2, 6, 5, 1};
        int i = 0;

        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
