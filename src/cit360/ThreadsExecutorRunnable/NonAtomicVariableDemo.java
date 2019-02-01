
package cit360.ThreadsExecutorRunnable;



public class NonAtomicVariableDemo {
    static final int NUMBER_THREADS = 100;
    
   public static class Counter {
    private int value;
 
    public void increment() {
        value++;
    }
 
    public void decrement() {
        value--;
    }
 
    public int get() {
        return value;
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
    

