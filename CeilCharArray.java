/* Given a characters array letters that is sorted in non-decreasing order and a  character
target, return the smallest character in the array that is larger than target.
Note : Letters are wrap around
 */
package com.Javadsa;
public class CeilCharArray {
    public static void main(String[] args) {
        char[] arr = {'f', 'g', 'k', 'm', 'q'};
        char target = 'f';
        char ans = solution(arr,target);
        System.out.println(ans);
    }
    static char solution(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        if (arr[end] < target)
            return arr[0];

        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return arr[mid + 1];
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr[start];
    }
}
