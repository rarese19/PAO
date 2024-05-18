package threads.synchronize;

public class SynchronizedCounter implements Runnable{
    private Integer count = 0;

    @Override
    public void run() {
        threadName();
    }

    public synchronized void increment() {
        count++;
        System.out.println(count);
    }

    public synchronized void threadName() {
        System.out.println(Thread.currentThread().getName());
    }

    /*public void increment() {
        count++;
        System.out.println(count);
    }*/

}

