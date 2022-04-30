package exception;
import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\input.txt");
        Scanner read = new Scanner(file);
        PrintWriter wr = new PrintWriter(file);

        wr.write("java is not javascript");
        wr.close();

    }
}
