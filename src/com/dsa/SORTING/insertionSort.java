package com.dsa.SORTING;

// 0 to n-2 times the loop will run
// O(n^2) time complexity : worst case
// O(n)  :best case
// use case: Adaptive:steps reduced ,No. of swaps reduced as compared to bubble sort

// works well in array that is partially sorted array

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr ={1,-2,3,4,-5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                   swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }

    }

    static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }

}
