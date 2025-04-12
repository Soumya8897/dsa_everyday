package com.dsa.SORTING;

import java.util.Arrays;

// also sinking /exchange sort
//space complexity is O(1)
//inPlace sorting algorithm -you don't have to create a new array
// time complexity is O(n)
// worst case :O(n^2)
//stable sorting algo
public class bubbleSort {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       bubble(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }

    }
}
