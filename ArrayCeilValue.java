package com.Javadsa;
public class ArrayCeilValue {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18,20,34,49,52,66,71,83,95,100};
        int target =82;
        int ans = ceilVal(arr,target);
        if (ans == 0)
            System.out.println("Value Not found !");
        else
            System.out.println("Ceil Value is " + arr[ans]);
    }
    static int ceilVal(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start+end)/2;
            if (arr[mid] == target )
                return mid+1;
            else if ( arr[mid - 1] < target & arr[mid + 1] > target)
                return mid;
            else if (target >= arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return 0;
    }
}
