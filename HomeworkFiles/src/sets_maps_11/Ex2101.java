package sets_maps_11;

import java.util.LinkedHashSet;

public class Ex2101 {
    public static LinkedHashSet<String> set1;
    public static LinkedHashSet<String> set2;
    public  static void main(String[] args){
        String[] arr1 = {"George",
                "Jim", "John", "Blake", "Kevin", "Michael"};
        set1 = new LinkedHashSet<>();
        for(int i = 0; i < arr1.length; i++){
            set1.add(arr1[i]);
        }
        String[] arr2 = {"George", "Katie",
                "Kevin", "Michelle", "Ryan"};
        set2 = new LinkedHashSet<>();
        for(int i = 0; i < arr2.length; i++){
            set2.add(arr2[i]);
        }

        System.out.print("Union of set1 and set2: ");
        set1.addAll(set2);
        System.out.println(set1);

        reset();
        System.out.print("Difference of set1 from set2: ");
        set1.removeAll(set2);
        System.out.println(set1);

        reset();
        System.out.print("Intersection of set1 and set2: ");
        set1.retainAll(set2);
        System.out.println(set1);

    }

    public static void reset(){
        set1.clear();
        set2.clear();
        String[] arr1 = {"George",
                "Jim", "John", "Blake", "Kevin", "Michael"};
        set1 = new LinkedHashSet<>();
        for(int i = 0; i < arr1.length; i++){
            set1.add(arr1[i]);
        }
        String[] arr2 = {"George", "Katie",
                "Kevin", "Michelle", "Ryan"};
        set2 = new LinkedHashSet<>();
        for(int i = 0; i < arr2.length; i++){
            set2.add(arr2[i]);
        }

    }
}
