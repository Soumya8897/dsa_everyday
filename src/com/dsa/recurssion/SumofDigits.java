package com.dsa.recurssion;

public class SumofDigits {
    public static void main(String[] args) {
      System.out.print(product(1445));
    }

    static int sum(int n){
        if(n<2){
          return 1;
        }
        return n%10 + sum(n/10);
    }
    static int product(int n){
        if(n%10 == n){
            return 1;
        }
        return n%10 * product(n/10);
    }

}
