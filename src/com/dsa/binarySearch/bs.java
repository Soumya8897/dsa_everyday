package com.dsa.binarySearch;

public class bs {
    public static void main(String[] args) {
        int[] arr={12,45,67,89,90};
        System.out.println(binarySearch(arr,67));
        int[] arr1={99,56,43,32,21,11};
        System.out.println(descBinarySearch(arr1,56));
    }
    // return ind
    static int binarySearch(int[] arr,int target){
      int start=0;
      int end= arr.length -1;
      while(start<=end){
          int mid = start+(end-start)/2;
          if(target< arr[mid]){
              end=mid-1;
          }else if(target> arr[mid]){
              start= mid+1;
          }else{
              return mid;
          }
      }
      return -1;
    }
    static int descBinarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                end=mid-1;
            }else if(target<arr[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
