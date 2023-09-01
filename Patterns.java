package com.Javadsa;

public class Patterns {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
        pattern4(10);
    }
//    static void pattern1(int n){
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    //------------------------------------------------------
//    static void pattern2(int n){
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= (n+1) - row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    //-------------------------------------------------------
//    static void pattern3(int n){
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
//    }
    //-------------------------------------------------------
        static void pattern4(int n){
        for (int row = 1; row < n; row++){
            for (int col = 1; col < n; col++) {
                if (row>=col)
                    System.out.print("* ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
