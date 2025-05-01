package com.dsa.recurssion.arrays;

import java.util.ArrayList;
import java.util.List;

public class linearSearch {
    public static void main(String[] args) {
     int[] arr={1,2,3,6,6,9};
     int target =6;
        List<Integer> li=new ArrayList<Integer>();
     System.out.println(findAllIndex(arr,target,0));
     System.out.println(linearSearch(arr,target,0));
     System.out.println(findAllIndexes(arr,target,0,li));
    }
    static int linearSearch(int[] arr,int target,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target) {
            return i;
        }else{
            return linearSearch(arr,target,i+1);
        }
    }
    static List<Integer> findAllIndex(int[] arr, int target, int i){
        List<Integer> li=new ArrayList<Integer>();
        if(i == arr.length){
            return li;
        }
        li = findAllIndex(arr,target,i+1);
        if(arr[i] == target) {
          li.add(0,i);
        }
        return li;
    }
    static List<Integer> findAllIndexes(int[] arr, int target, int i,List<Integer> li){
        if(i == arr.length){
            return li;
        }
        if(arr[i] == target) {
            li.add(0,i);
        }
        return  findAllIndexes(arr,target,i+1,li);
    }
}
