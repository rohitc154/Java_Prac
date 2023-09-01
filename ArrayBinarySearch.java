package com.Javadsa;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,39,41,49,50,56,66,73,81,93,105};
        int value = 93;
        search(arr,value);
    }

    static void search(int[] arr,int value){
        int start = 0;
        int end = arr.length - 1;
        int mid = (start+end)/2;

        for (int i = start; i <= end; i++){
            mid = (start+end)/2;

            if (value < arr[mid]){
                end = mid;
            } else if (value > arr[mid]) {
                start = mid;
            } else if (value == arr[mid]) {
                System.out.println("Value Found at index " + mid + " Which is " + arr[mid]);
                break;
            } else {
                System.out.println("Value Not Found !");
                break;
            }
        }
    }
}
