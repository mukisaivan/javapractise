package xLASTLESSONS.THREADS.SIMPLETHREADS;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // note:::the current thread is main

        //Thread.currentThread().setName("MARW");
        //   .sleep
        //   .setPriority


        // System.out.println(Thread.activeCount());   -- gets the amount of threads that are running 

        // MyThread thread2 = new MyThread();

        for (int i = 5; i > 0; i--) {
            System.out.println(i);

            Thread.sleep(1000);
        }
        System.out.print("you done!");
        
    }
}
