package com.dsa.recurssion;

import java.util.ArrayList;

public class phonePattern {
    public static void main(String[] args) {

        System.out.println(patternReturn("","12"));
    }
    static void pattern(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch =(char)('a'+i);
            pattern(p+ch,up.substring(1));
        }

    }

    static ArrayList<String> patternReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch =(char)('a'+i);
            list.addAll( patternReturn(p+ch,up.substring(1)));
        }
        return list;

    }

}
