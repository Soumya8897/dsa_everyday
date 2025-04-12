package com.dsa.SORTING;

import java.util.Arrays;

// when given range 1,N - use cycle sort
// worst case :O(n)
// best case :O(n)
public class cycleSort {
    public static void main(String[] args) {
    int[] arr={2,5,4,3,1};
    cyclesort(arr);
    System.out.println(Arrays.toString(arr));
    }

    static void cyclesort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct] != arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }

}
