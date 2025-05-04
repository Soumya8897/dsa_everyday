package com.dsa;

import java.util.Arrays;

public class Kandanes_algo {
    public static void main(String[] args) {
        int[] arr ={-2,-3,4,-1,-2,1,5,-3};
       System.out.println(maxSubArraySum(arr));
    }
    static int maxSubArraySum(int[] arr){
        int sum=0,maxi=Integer.MIN_VALUE;
        int[] subarraylength=new int[2];
        int s=0,as=-1,ae=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
                s=i;
            }
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
                as=s;
                ae=i;
            }
            if(sum<0){
                sum=0;
            }
        }

        subarraylength[0]=as;
        subarraylength[1]=ae;
        System.out.println(Arrays.toString(subarraylength));
        return maxi;
    }
}
