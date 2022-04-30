package Binary_IO;

import java.io.DataOutputStream;
import java.io.*;
import java.util.Random;

public class Ex1702 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Binary_IO/Exercise17_02.dat");
        try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {

            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                int j = rand.nextInt(100);
                out.writeInt(j);

            }

        }
    }
}
