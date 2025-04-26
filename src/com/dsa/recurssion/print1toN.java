package com.dsa.recurssion;

public class print1toN {
    public static void main(String[] args) {

        print(8);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
