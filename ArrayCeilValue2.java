package com.Javadsa;
//Ceil Value meaning, finding the smaller value in the array, which is greater than target value.
public class ArrayCeilValue2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 39, 41, 49, 50};
        int value = 30;
        int ans = search(arr, value);
        if (ans == -1)
            System.out.println("Value Not Found!");
        else
            System.out.println("Ceil Value of "+ value +" is at index " + ans + ", Which is " + arr[ans]);
    }
    static int search(int[] arr,int value){
        int start = 0;
        int end = arr.length - 1;
        if (arr[end] < value)
            return -1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == value){
                return mid + 1;
            } else if (arr[mid] > value) {
                end = mid - 1;

            } else
                start = mid + 1;
        }
        return start;
    }
}
