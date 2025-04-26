package com.dsa.recurssion;

public class Concept {
    public static void main(String[] args) {
       fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--); // lead to infinte recurssion or stack overflow
         fun(--n);
    }
}
