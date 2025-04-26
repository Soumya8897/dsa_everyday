package com.dsa.recurssion;

public class countZeros {
    public static void main(String[] args) {
       System.out.print(count(302040,0));
    }

    static int count(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10 ==0){
            return count(n/10,c+1);
        }
       return count(n/10,c);
    }
}
