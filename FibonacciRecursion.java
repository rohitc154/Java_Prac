package com.Javadsa;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Term : ");
        int term = in.nextInt();
        System.out.println(term + " term of Fibonnaci Series is "+fib(term));
    }
    static int fib(int term){
        if (term == 1 || term == 2)
            return 1;
        else
            return fib(term-1) + fib(term - 2);
    }
}
