package com.dsa.bs2D;

public class rowwithmax1s {
    public static void main(String[] args) {
        int[][] mat={{1,1,1}, {1, 1, 0}, {0, 0, 0}};
        System.out.println(rowWithMax1s(mat));

    }
    public static int firstOne(int[] row) {
        int l = 0, h = row.length - 1;
        int index = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (row[mid] == 1) {
                index = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }
    public static  int rowWithMax1s(int[][] mat) {
        int maxi=0,ind=-1;
        for(int i=0;i<mat.length;i++){
            int firstOneIndex = firstOne(mat[i]);
            if (firstOneIndex != -1) {
                int cnt = mat[i].length - firstOneIndex;
                if(cnt>maxi){
                    maxi=cnt;
                    ind=i;
                }
            }
        }
        return ind;
    }
}
