package com.Javadsa;

public class GCDRecursion {
    public static void main(String[] args) {

        System.out.println(GCD(4,6));
    }
    static int GCD(int num1, int num2){
        if (num1 == num2)
            return num1;
        if (num1 % num2 == 0)
            return num2;
        if (num2 % num1 == 0)
            return num1;
        if (num1 > num2)
            return GCD(num1%num2,num2);
        else
            return GCD(num1, num2%num1);
    }
}
