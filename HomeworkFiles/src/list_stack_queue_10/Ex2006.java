package list_stack_queue_10;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex2006 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 50000; i++){
            list.add(i);
        }
        double time1 = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++){
            list.get(i);
        }
        double time2 = System.currentTimeMillis();
        System.out.println("Time for method get: " + ((time2-time1)/1000) + " seconds.");

        time1 = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next();
        }

        time2 = System.currentTimeMillis();
        System.out.println("Time for iterator: " + ((time2-time1)/1000) + " seconds.");

    }
}
