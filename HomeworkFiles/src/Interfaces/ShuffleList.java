package Interfaces;

import java.util.*;


public class ShuffleList {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            list.add((int)(Math.random() * 10));
        }
        System.out.println("Original: ");
        System.out.println(list);
        System.out.println("After shuffle: ");
        shuffle(list);
        System.out.println(list);
        System.out.println("After sorting: ");
        sort(list);
        System.out.println(list);
    }
    public static void shuffle(ArrayList<Number> list){
       for(int i = 0; i < list.size(); i++){
           int rnd = (int)(Math.random() * list.size());
           Number first = list.get(i);
           Number second = list.get(rnd);
           list.set(i, second);
           list.set(rnd, first);
       }
    }
    public static void sort(ArrayList<Number> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if((int)list.get(i) > (int)list.get(j)){
                    Number first = list.get(i);
                    Number second = list.get(j);
                    list.set(i, second);
                    list.set(j, first);
                }
            }
        }
    }

}
