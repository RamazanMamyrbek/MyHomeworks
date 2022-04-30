package Generics;

import java.util.ArrayList;
import java.util.Random;

public class Ex1904 {
    public static void main(String[] args) {
        Integer[] list = {2,4,6,3,8,0,9};
        System.out.println(Ex1904.linearSearch(list, 3));
    }
    public static <E extends Comparable<E>>
    int linearSearch(E[] list, E key){
        int index = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] == key){
                index = i; break;}
        }
        return index;
    }
}
