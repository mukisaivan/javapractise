package xLASTLESSONS.THREADS.MULTITHREADS;
 

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread1.join();     // this stops thread2 form combining with thread1 ie it waits for thread1 to finish then thread2 continues
        thread2.start();


    }
}
