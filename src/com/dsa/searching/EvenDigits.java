package com.dsa.searching;

public class EvenDigits {
    public static void main(String[] args) {
     int ans= findNumbers(new int[]{18,124,1764,98,1});
     System.out.println(ans);
    }
    public  static int findNumbers(int[] nums) {
      int count =0;
      for(int num:nums){
          if(even(num)){
              count++;
          }
      }
      return count;
    }
    static boolean even(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return false;
        }
        int digits=0;
       while(num>0){
           num=num/10;
           digits++;
       }

       return digits%2 ==0;
    }
}
