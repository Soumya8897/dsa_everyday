package com.dsa.binarySearch;

public class rotatedSortedArrayBS {
    public static void main(String[] args) {
        //steps
        //find pivot
        //search in the first half till pivot
        //search in the second half from pivot to end if not found in first half
        int[] arr =  {4,5,6,7,8,1,2};
        System.out.println(search(arr,1));
    }
    static int search(int[] nums,int target){
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }else if(target > nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
            return binarySearch(nums,target,pivot+1,nums.length-1);


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
    static int findPivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            //4 cases
            int mid = s+(e-s)/2;

            if(mid<e && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[s]>= arr[mid]){
                e=mid-1;
            }
            if(arr[s]< arr[mid]) {
                s=mid+1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            //4 cases
            int mid = s+(e-s)/2;

            if(mid<e && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[mid] == arr[s] && arr[mid] ==arr[e]){
                s++;
                e--;
            }
            else if( arr[s]<arr[mid] ||(arr[s]== arr[mid] && arr[mid]> arr[e])){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}
