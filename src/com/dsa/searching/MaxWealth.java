package com.dsa.searching;

public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        int balance=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int rowSum=0;
            for(int j=0;j<accounts[i].length;j++){
                rowSum+=accounts[i][j];
            }
            if(rowSum > balance ){
                balance=rowSum;
            }
        }
        return balance;

    }
}
