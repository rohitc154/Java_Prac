package com.Javadsa;

import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = {10, 20, 61, 31, 81, 24, 35, 94};
        System.out.print("Enter Value to Search : ");
        int num = in.nextInt();

        if (search(arr,num))
            System.out.println("Value Found !");
        else
            System.out.println("Value Not Found !");
    }
    static boolean search(int[] arr, int val){
        for (int j : arr) {
            if (val == j)
                return true;
        }
        return  false;
    }
}
