package com.dsa.recurssion;

public class ReverseNumber {
    public static void main(String[] args) {
     reverse(12345,0);
    }
    static void reverse(int n,int sum){
        if(n==0){
            System.out.print(sum);
            return;

        }
        int rem =n%10;
        sum=sum*10+rem;
        reverse(n/10,sum);
    }
}
