package com.dsa.binarySearch;

public class floor {
    public static void main(String[] args) {
        //greatest number that is smaller or equal to target number
        int[] arr={2,3,5,9,14,16,18};
        int target=1;
        int ans =findFloor(arr,target);
        System.out.println(ans);
    }
    static int findFloor(int[] arr, int target){
        if(target<arr[0]){
            return -1;
        }
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
        return end;
    }
}
