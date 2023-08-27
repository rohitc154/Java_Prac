package com.Javadsa;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {24, 63, 21, 81, 90, 10};

        System.out.println("Before Reversing : " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("After Reversing : " + Arrays.toString(arr));

    }
    static void reverseArray(int[] arr){
        int len = arr.length;
        int temp;
        for (int i = 0; i < len/2; i++) {
            temp = arr[i];
            arr[i] = arr[(len - 1) - i];
            arr[(len - 1) - i] = temp;
        }
    }
}
