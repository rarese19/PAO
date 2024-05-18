package threads.synchronize;

public class TestThreadName {
    public static void main(String[] args) {
        SynchronizedCounter name = new SynchronizedCounter();
        Thread thread = new Thread(name);
        Thread thread2 = new Thread(name);
        thread.start();
        thread2.start();
    }
}
