package com.dsa.SORTING;

//Selection sort:find largest elment and put it in its correct index
//Worst case and best case both are O(n^2)
//Not Stable
// use case :it performs well on small lists

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={2,1,3,-4,-5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length -i-1;
            int maxInd= getMaxIndex(arr,0,last);
            swap(arr,last ,maxInd);
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }

    static int getMaxIndex(int[] arr,int start,int end){
        int max= start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}