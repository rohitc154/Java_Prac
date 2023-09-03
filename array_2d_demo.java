package com.Javadsa;

import java.util.Arrays;
import java.util.Scanner;

public class array_2d_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter Values : ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
            for (int[] a : arr) {
//                System.out.println(arr[i][j]);
                System.out.println(Arrays.toString(a));
            }

    }
}
