package com.Javadsa;

import java.util.Arrays;

public class ArrayBubbleSort {
    public static void main(String[] args) {
//        int[] arr = {-32,-65,0,12,-89};
        int[] arr = {1, 2, 3, 4, 5};
        BubbleS(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleS(int[] arr){
        boolean check;
        for (int i = 0; i < arr.length; i++) {
            check = false;
            for (int j = 1; j < arr.length - i; j++){
             if (arr[j-1] > arr[j]){
                     int temp = arr[j];
                     arr[j] = arr[j - 1];
                     arr[j - 1] = temp;
                     check = true;
             }
            }
        if (!check)
            break;
        }
    }
}
