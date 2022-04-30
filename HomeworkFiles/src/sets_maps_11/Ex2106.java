package sets_maps_11;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Ex2106 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        Scanner read = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            int number = read.nextInt();
            list.add(number);
            if (number == 0)
                break;
        }
        for(int i = 0; i < list.size(); i++){
            int key = list.get(i);

            if(key >= 0){
                if(!map.containsKey(key)){
                    map.put(key, 1);
                }
                else{
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }


        SortedSet<Integer> keys = new TreeSet<>(map.keySet());
        for (Integer key : keys) {
            int value = map.get(key);
            System.out.println(key + " " + value);
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println();

        System.out.println(maxEntry.getKey()+" "+maxEntry.getValue());

        System.out.println();

        boolean f = false;

        map.remove(maxEntry.getKey());


        if(map.containsValue(maxEntry.getValue())){
            System.out.println("Duplicates were found");
        }else{        System.out.println(maxEntry.getKey());     }


}}

