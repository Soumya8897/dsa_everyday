package com.dsa.binarySearch;

public class peakIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,8,9,6,3,2};
        //first increases and then decreases this type is known as bitonic array.
        int ans= peakIndexInMountainArray(arr);
        System.out.println(arr[ans]);
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
}
