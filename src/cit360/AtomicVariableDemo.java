

package CIT360;

import java.util.concurrent.atomic.*;

public class AtomicVariableDemo {
    static final int NUMBER_THREADS = 100;
    
   public static class Counter {
    private AtomicInteger value = new AtomicInteger();
 
    public void increment() {
        value.incrementAndGet();
    }
 
    public void decrement() {
        value.decrementAndGet();
    }
 
    public int get() {
        return value.get();
    }
}

public static class UpdateThread extends Thread {
    private Counter counter;
 
    public UpdateThread(Counter counter) {
        this.counter = counter;
    }
 
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) { ex.printStackTrace(); }
 
        counter.increment();
    }
}   
   


 
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println("Initial Counter = " + counter.get());
 
        UpdateThread[] threads = new UpdateThread[NUMBER_THREADS];
 
        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i] = new UpdateThread(counter);
            threads[i].start();
        }
 
        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i].join();
        }
 
        System.out.println("Final Counter = " + counter.get());
    }
}
    

