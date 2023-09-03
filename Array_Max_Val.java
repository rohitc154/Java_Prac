package com.Javadsa;

public class Array_Max_Val {
    public static void main(String[] args) {
        int[] arr = {8,6,8,24,30};

        System.out.println("Max Value is : " + maxVal(arr));
    }
    static int maxVal(int[] arr){

        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
