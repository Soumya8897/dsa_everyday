package com.dsa;
import java.util.*;
public class topStudent {
    public static void main(String[] args) {
        List<List<String>> l = Arrays.asList(
                Arrays.asList("soumya", "46"),
                Arrays.asList("lavanya", "45"),
                Arrays.asList("lavanya", "45")
        );
        Map<String,Integer> mp=new HashMap<>();
        Map<String,Integer> cntmp=new HashMap<>();
        for(int i=0;i<l.size();i++){
            String name = l.get(i).get(0);
            int score = Integer.parseInt(l.get(i).get(1));
            int current = mp.getOrDefault(name, 0);
            mp.put(name, current + score);
            cntmp.put(name,current+1);
        }
        String topStudent = "";
        double maxAverage = 0;

        for (Map.Entry<String, Integer> set :
                mp.entrySet()) {
            int totalscore=mp.get(set.getKey());
            int count = cntmp.get(set.getKey());
            double avg = (double) totalscore / count;
            if(avg>maxAverage){
                topStudent=set.getKey();
                maxAverage=avg;
            }
        }
        System.out.println(topStudent);
        System.out.println(maxAverage);

    }
}
