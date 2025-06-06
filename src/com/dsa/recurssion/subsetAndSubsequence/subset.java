package com.dsa.recurssion.subsetAndSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//time complexity : O(N*2^N)
//space complexity : O(N*2^N)
public class subset {
    public static void main(String[] args) {
        int[] arr={5,6,6};
        List<List<Integer>> ans= subsetDuplicate(arr);
         for(List<Integer> list:ans){
System.out.println(list);
         }

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n= outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            s=0;
            if(i>0 && arr[i] == arr[i-1]){
                s=e+1;
            }
            e=outer.size() -1;
            int n= outer.size();
            for(int j=s;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
