package com.dsa.backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
//       System.out.println(count(3,3));
//       print("",3,3);
//        System.out.println(printRet("",3,3));
//        System.out.println(printDiagonal("",3,3));
        boolean[][] path={
                {true,true,true},
                {true,false,true},
                {true,true,true}

        };
        pathRiver("",path,0,0);
    }
    static int count(int r,int c){
        if(r ==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right= count(r,c-1);
        return left+right;
    }
    static void print(String p,int r,int c){
        if(r ==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1) {
            print(p + "R", r - 1, c);
        }
        if(c>1) {
            print(p + "D", r, c - 1);
        }
    }
    static ArrayList<String> printRet(String p, int r, int c){
        if(r ==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            if(!p.isEmpty()) {
                list.add(p);
            }
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1) {
            list.addAll(printRet(p + "R", r - 1, c));
        }
        if(c>1) {
            list.addAll(printRet(p + "D", r, c - 1));
        }
        return list;
    }
    static ArrayList<String> printDiagonal(String p, int r, int c){
        if(r ==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            if(!p.isEmpty()) {
                list.add(p);
            }
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1 && c>1) {
            list.addAll(printDiagonal(p + "D", r - 1, c-1));
        }
        if(r>1) {
            list.addAll(printDiagonal(p + "H", r - 1, c));
        }
        if(c>1) {
            list.addAll(printDiagonal(p + "V", r, c - 1));
        }

        return list;
    }
    static void pathRiver(String p,boolean[][] path,int r,int c){
        if(r == path.length-1 && c == path[0].length-1){
            System.out.println(p);
            return;
        }
        if(!path[r][c]){
            return;
        }
        if(r<path.length-1) {
            pathRiver(p + "R",path, r + 1, c);
        }
        if(c<path[0].length-1) {
            pathRiver(p + "D",path, r, c + 1);
        }
    }
}
