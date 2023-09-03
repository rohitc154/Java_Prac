package com.Javadsa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr2 = {75, 76, 77};
        ArrayList<Integer> list = new ArrayList<Integer>();

//        list.add(5);
//        list.add(25);
//        list.add(153);
//        list.add(18);
//        list.add(24);
//        list.add(59);
//        list.set(2,51);

        for (int i = 0; i < 5; i++){
            System.out.print("Enter Element : ");
            list.add(sc.nextInt());
        }

        System.out.println("Array List : " + list);
        System.out.println("Removed Element : " + list.remove(1));
        Collections.sort(list);
        System.out.println("After Sorting : " + list);

    }
}
