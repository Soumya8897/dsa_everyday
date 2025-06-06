package com.dsa.searching;

import java.util.Arrays;

public class searchin2Drray {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {12,3,9},
                {9,34,56,99}
        };
        int target =34;
        int[] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr,int target){
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
              if(arr[i][j] == target){
                  return new int[]{i,j};
              }
          }
      }
      return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] > max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
