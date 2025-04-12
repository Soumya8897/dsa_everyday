package com.dsa.binarySearch;

public class rotationCount {
    public static void main(String[] args) {
        int[] arr =  {4,5,6,7,8,1,2};
        int ans=findPivot(arr)+1;
        System.out.println("Rotation count is "+ans);
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
}
