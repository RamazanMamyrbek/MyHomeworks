package Binary_IO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class Ex1701 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Binary_IO/Exercise17_01.txt");
        PrintWriter writer = new PrintWriter(file);
        Random rand = new Random();
        for (int i = 0; i < 100; i++){
            int j = rand.nextInt(100);
            writer.print(j);
            writer.print(" ");
        }
        writer.close();
    }
}
