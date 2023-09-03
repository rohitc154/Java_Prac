package com.Javadsa;

public class ArrayOrderAgnosticBS {
    public static void main(String[] args) {
        //Array Agnostic Meaning, Order of arrangement of element (asc/desc) the Array
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 39, 41, 49, 50};
//        int[] arr2 = {50, 49, 41, 39, 36, 20, 14, 12, 11, 9, 6, 4, 2};
        int value = 37;

        if (search(arr, value))
            System.out.println("Value Found !");
        else
            System.out.println("Value Not Found !");
    }
    static boolean search(int[] arr,int value){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
             int mid = (start + end) / 2;

            if (arr[0] < arr[end]) {

                if (value < arr[mid]) {
                    end = mid - 1;
                } else if (value > arr[mid]) {
                    start = mid + 1 ;
                } else
                    return true;
            }
            else {
                if (value > arr[mid]) {
                    end = mid - 1 ;
                } else if (value < arr[mid]) {
                    start = mid + 1;
                } else
                    return true;
            }
        }
        return false;
    }
}


