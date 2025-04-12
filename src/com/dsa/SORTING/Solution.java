package com.dsa.SORTING;

class MissingNumber {

    public static void main(String[] args) {
        int[] arr={4,0,1,2};
        int ans = missingNumber(arr);
        System.out.println(ans);

    }

    public static int missingNumber(int[] arr) {
      int ans = cyclesort(arr);
      return ans;   
    }
     static int  cyclesort(int[] arr){
        int i=0;
        while(i<arr.length){
            if( arr[i] < arr.length && arr[arr[i]] != arr[i]){
                swap(arr,i,arr[i]);
            }else{
                i++;
            }
        }

        for( int ind=0;ind<arr.length;ind++){
            if(arr[ind]!=ind){
                return ind;
            }
        }
        return arr.length;
    }
    static  void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }

}