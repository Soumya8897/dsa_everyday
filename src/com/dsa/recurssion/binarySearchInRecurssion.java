package com.dsa.recurssion;

public class binarySearchInRecurssion {
    public static void main(String[] args) {
        //comparing mid and target
        //pivoting into 2 halves
     int[] arr={1,2,3,55,66,78};
     int target=75;
     System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m= s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }// when the function has a return type
        //whenever it is called it should have a
        //return type.
       return search(arr,target,m+1,e);
    }
    // types of recurrance relations:
    // linear
}
