package com.dsa.binarySearch;

public class searchInMountain {
    public static void main(String[] args) {

    }
    public int findInMountainArray(int target, int[] arr) {
       int peak = peakIndexInMountainArray(arr);
       int firstTry= binarySearch(arr,target,0,peak);
       if(firstTry!=-1){
           return firstTry;
       }
        int secondTry= descBinarySearch(arr,target,peak,arr.length-1);
        return secondTry;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end= arr.length -1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
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
    static int descBinarySearch(int[] arr,int target,int start,int end){

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
