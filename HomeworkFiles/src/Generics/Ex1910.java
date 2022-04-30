package Generics;

import java.util.ArrayList;
import java.util.Random;

public class Ex1910 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 0; i < 10;i++){
            numbers.add(rand.nextInt(100));
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.print("Max element is " + max(numbers));

    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E max = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if((Integer)max < (Integer)list.get(i)){
                max = list.get(i);
            }
        }

        return max;
    }
}
