package com.dsa.recurssion.arrays;

public class SortedOrNot {
    public static void main(String[] args) {
      int[] arr ={1,2,3,8,9,7};
      System.out.print(checkSorted(arr,0));
    }

    static boolean checkSorted(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
      return arr[i]<arr[i+1] && checkSorted(arr,i+1);
    }


}
