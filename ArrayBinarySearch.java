package com.Javadsa;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 39, 41, 49, 50};
        int value = 2;

        if (search(arr, value))
            System.out.println("Value Found! ");
        else
            System.out.println("Value Not Found !");
    }
    static boolean search(int[] arr,int value){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == value){
                return true;
            } else if (arr[mid] > value) {
                end = mid - 1;

            } else
                start = mid + 1;
            }
        return false;
    }
}
