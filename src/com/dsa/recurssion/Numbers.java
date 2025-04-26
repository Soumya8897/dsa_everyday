package com.dsa.recurssion;

public class Numbers {
    public static void main(String[] args) {

        // write a function that takes in a number and prints it
        print1(5);
    }
    static void print1(int n){
        if(n == 0) {
            return;
        }// base condition
        System.out.println(n);
        print1(n-1);
    }
    // function calls working internally:
    // main -> function 1 -> function 2(top of stack)
    // stack overflow error happens when the recurssive
    // calls keep happening without stop
    // you can convert any recurssive solution into iteration


}
