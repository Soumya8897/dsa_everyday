package com.dsa.backtracking;

public class AllPaths {
    public static void main(String[] args) {

        boolean[][] path={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        pathRiver("",path,0,0);
    }

    static void pathRiver(String p,boolean[][] path,int r,int c){
        if(r == path.length-1 && c == path[0].length-1){
            System.out.println(p);
            return;
        }
        if(!path[r][c]){
            return;
        }
        path[r][c]=false;
        if(r<path.length-1) {
            pathRiver(p + "R",path, r + 1, c);
        }
        if(c<path[0].length-1) {
            pathRiver(p + "D",path, r, c + 1);
        }
        if(r>0) {
            pathRiver(p + "U",path, r-1, c);
        }
        if(c>0) {
            pathRiver(p + "L",path, r, c-1);
        }

        path[r][c]=true;

    }

}
