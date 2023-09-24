package com.Javadsa;
import java.util.Arrays;

public class ArraySelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,5,21,62,41};

        sort(arr);
        System.out.println(Arrays.toString(arr));
//        maxval(arr);
    }
    static void sort(int[] arr){
        int l = arr.length - 1;
        int temp = arr[0];
        for (int i = 0; i <= l; i++){
            for (int j = 0; j < l - i; j++) {
                if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
//             l--;
        }
    }
//    static void maxval(int[] arr){
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i]){
//                int temp = max;
//                max = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println("Max Value "+ max);
//    }
}
