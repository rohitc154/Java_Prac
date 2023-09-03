package com.Javadsa;

import java.util.Arrays;
import java.util.Scanner;

public class arraydemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];
        System.out.println("Enter Roll of 5 Students : ");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.next();
        }
        arr[2] = "love";
        System.out.println("Rolls are : "+Arrays.toString(arr));
//        for (String ele : arr){
//            System.out.print(ele+" ");
//        }
    }
}
