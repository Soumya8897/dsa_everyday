package com.dsa.binarySearch;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {3, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;


    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
    }

    int search(int[]arr,int target,boolean fstart){
        int ans=-1;
        int start=0;
        int end= arr.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target< arr[mid]){
                end=mid-1;
            }else if(target> arr[mid]){
                start= mid+1;
            }else{
                ans=mid;
                if(fstart){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
