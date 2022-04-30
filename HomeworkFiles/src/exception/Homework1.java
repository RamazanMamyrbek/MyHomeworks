package exception;
import java.util.*;
public class Homework1 {
    public static void main(String[] args){
        Scanner read  = new Scanner(System.in);
        int[] mass = new int[100];
        for(int i = 0; i < 100; i++){
            mass[i] = (int)(Math.random()*100);
        }
        try{
        printMass(mass,read);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The specified index is out of bounds.");
        }

    }
    public static void printMass(int[] mass,Scanner read) throws ArrayIndexOutOfBoundsException{
        System.out.println("Enter an index:");
        int index = read.nextInt();
        System.out.println(mass[index]);

    }
}
