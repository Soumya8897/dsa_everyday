package com.dsa.Strings;

public class Strings {
    public static void main(String[] args) {
        String name="soumya";

        // when we create 2 strings with same name then
       // both are reference variables are pointing towards same
        // it is declared like this String name="soumya" in String Pool
        String b="soumya";
        //here name and b pointing at one object only
         b="sea";
//         here a new 'b' object  is created this is due to the
//        immutability of the string.


    }
}
