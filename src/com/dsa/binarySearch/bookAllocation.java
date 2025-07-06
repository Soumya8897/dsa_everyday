package com.dsa.binarySearch;

public class bookAllocation {
    public static void main(String[] args) {
        int[] nums={10,20,30,40};
        int m=2;
        System.out.println(findPages(nums,m));
    }
    public static int findPages(int[] nums, int m) {
        if(m>nums.length)return -1;
        int maxi=nums[0],sum=0;
        for(int i=0;i<nums.length;i++){
            if(maxi<nums[i]){
                maxi=nums[i];
            }
            sum=sum+nums[i];
        }
        int low=maxi,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int num=count(nums,mid);
            if(num>m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;

    }
   static  int count(int[] nums,int pages){
        int s=1;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+p<=pages){
                p=p+nums[i];
            }else{
                s++;
                p=nums[i];
            }
        }
        return s;
    }}
