package threads30;

public class Ex3011 {
    public static  void main(String[] args) throws InterruptedException{
        Integer a = 1;
        Integer b = 2;
        Thread thead1 = new Thread(){
            @Override
            public void run() {
                synchronized (a){
                    System.out.println("A is synchronized.");

                try{Thread.sleep(1000);
                } catch (InterruptedException ex){}
                synchronized (b){
                  System.out.println("B is synchronized.");
                }
            }}
        };

        Thread thead2 = new Thread(){
            @Override
            public void run() {
                synchronized (b){
                    System.out.println("B is synchronized.");

                try{Thread.sleep(1000);
                } catch (InterruptedException ex){}
                synchronized (a){
                    System.out.println("A is synchronized.");
                }
            }}
        };

        thead1.start();
        thead2.start();
    }
}
