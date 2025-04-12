package com.dsa.binarySearch;

public class smallestLetterGreaterThnTarget {
    public static void main(String[] args) {
       char[] arr={'c','f','j'};
       char target='c';
       System.out.println(nextGreatestLetter(arr,target));
    }
    public static char nextGreatestLetter(char[] arr, char target) {

        int start=0;
        int n=arr.length;
        int end=n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target< arr[mid]){
                end=mid-1;
            }else {
                start= mid+1;
            }
        }
        return arr[start%n];
    }
}
