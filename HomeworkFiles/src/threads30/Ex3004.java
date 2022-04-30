package threads30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex3004 {
    static Integer sum = 0;
    public static void main(String[] args){
    ExecutorService executor = Executors.newCachedThreadPool();
        for(int i = 0; i < 1000; i++){
          executor.execute(new CustomThread());
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println(sum);
    }
    static class CustomThread extends Thread{

        @Override
        public void run() {
            synchronized (sum){
                sum += 1;
            }
        }
    }
    public static synchronized void add(int a){
        sum+=a;
    }
}
