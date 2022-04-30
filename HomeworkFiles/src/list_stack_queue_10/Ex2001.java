package list_stack_queue_10;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex2001 {
    public static void main(String[] args) throws Exception{
        File file = new File("src/list_stack_queue_10/Ex20_01.txt");
        Scanner read = new Scanner(file);
        List<String> list = new ArrayList<>();

        while(read.hasNext()){
            String word = read.next();
            list.add(word);
        }
        Collections.sort(list);
        int i = 0;
        for(String word: list){
            i++;
            System.out.print(word + " ");
            if(i%7 == 0)
                System.out.println();
        }
    }
}
