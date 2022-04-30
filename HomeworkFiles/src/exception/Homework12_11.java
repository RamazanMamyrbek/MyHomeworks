package exception;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class Homework12_11 {
    public static void main(String[] args) throws IOException {
        //Создание объекта файла и вывод на экран
        File file = new File("src\\input.txt");
          Scanner read = new Scanner(file);
          System.out.println("input.txt: ");
        String line = "";
          while(read.hasNext()){
              line += read.nextLine();
          }
          read.close();
          System.out.println(line);

          //Удаление...
        Scanner input = new Scanner(System.in);
          System.out.print("Remove string: ");String removeString = input.nextLine();
          input.close();
        line = line.replace(removeString, "");

        //запись и чтение
        PrintWriter write = new PrintWriter(file);
        write.print(line);
        write.close();
        Scanner oky = new Scanner(file);
        line = "";
        while(oky.hasNext()){
            line += oky.nextLine();
        }
        System.out.println(line);
    }
}
