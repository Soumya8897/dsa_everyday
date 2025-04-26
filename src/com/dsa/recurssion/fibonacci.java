package com.dsa.recurssion;

public class fibonacci {
    public static void main(String[] args) {

        System.out.println(fibo(5));
    }

    // the already known values are always the
    //base condition

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
        // this is not tail recurssion
    }
}
