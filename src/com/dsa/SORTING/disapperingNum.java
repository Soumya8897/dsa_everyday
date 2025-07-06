package com.dsa.SORTING;

import java.util.ArrayList;
import java.util.List;

public class disapperingNum {
    public static void main(String[] args) {
    int[] arr={1,3,4,6,5,5};
    List<Integer> ans=cyclesort(arr);
    System.out.println(ans);
    }
   static List<Integer> cyclesort(int[] arr){
        int i=0;
        List<Integer> ans=new ArrayList<Integer>();
        while(i<arr.length){
            int correct =arr[i]-1;
            if( correct < arr.length && arr[correct] != arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }


        for( int ind=0;ind<arr.length;ind++){
            if(arr[ind]!=ind+1){
                ans.add(ind+1);
            }

        }
        return ans;
    }
    static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }


}
