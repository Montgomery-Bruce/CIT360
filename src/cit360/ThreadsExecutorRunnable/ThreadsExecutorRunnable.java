package cit360.ThreadsExecutorRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.*;

//Counter class used for incrementing a variable
class Counter {
    //Create and AtomicInteger variable that can handle multi threading
    private AtomicInteger value = new AtomicInteger();
     
    public void increment() {
        value.incrementAndGet();
    }
 
    public int get() {
        return value.get();
    }
}

class MyExtendedThread extends Thread{
    private Counter counter; 
    
    public MyExtendedThread(Counter counter) { //Constructor
        this.counter = counter;
    }
    public void run(){
       try {
        Thread.sleep(400);
        System.out.println(Thread.currentThread().getName() + "My Extended Thread Running "); //shows which thread is running
       } 
        catch (InterruptedException exc) {
            exc.printStackTrace();
        }
       counter.increment(); //increments the counter each time the thread is run.
}
}
class MyRunnableThread implements Runnable {

     public void run() {
        try {
        for(int i=0; i<5; i++){
            
        Thread.sleep(400);
        System.out.println(Thread.currentThread().getId() + "My Runnable Thread Running " + i); //shows which thread is running
        }
       } 
        catch (InterruptedException exc) {
            exc.printStackTrace();
        }   
        }    
    }

class MyExecutorThread implements Runnable {

     public void run() {
         try {
        for(int i=0; i<5; i++){
            
        Thread.sleep(400);
        System.out.println(Thread.currentThread().getName() + "My Executor Thread Running "); //shows which thread is running
        }
        }catch (InterruptedException exc){
        exc.printStackTrace();
        }   
    }    
}

public class ThreadsExecutorRunnable {
    
    static final int NUMBER_THREADS = 100;

    public static void main(String[] args) throws InterruptedException {
       Counter counter = new Counter(); //Instantiates the Counter object
       System.out.println("Initial Counter = " + counter.get()); //Prints the initial value of the counter value
       
       System.out.println(Thread.currentThread().getName()); //This prints the name of the main thread when the program first starts
       
       MyExtendedThread[] extendedThread1 = new MyExtendedThread[NUMBER_THREADS]; //This creates a MyExtendedThread class object and names it extendedThread
               for (int i = 0; i < NUMBER_THREADS; i++) { //Will create as many threads as in the NUMBER_THREADS constant
                extendedThread1[i] = new MyExtendedThread(counter);
                extendedThread1[i].start();
               }

       MyRunnableThread runnableObject = new MyRunnableThread(); //This creates an MyRunnableThread "Runnable" object and names it runnableObject
       Thread runnableThread = new Thread(runnableObject); //Now a thread called runnableThread is contstructed from the runnableObject
       runnableThread.start(); //Start execution of the thread
            
       
       ExecutorService executorThread = Executors.newFixedThreadPool(2); //create the pool of threads
       Runnable ExecutorThread1 = new MyExecutorThread(); 
       Runnable ExecutorThread2 = new MyExecutorThread(); //Create 2 new objects of type MyExecutorThread class
           
       executorThread.execute(ExecutorThread1); 
       executorThread.execute(ExecutorThread2); //Submit the task for execution
              
       executorThread.shutdown(); //The executor service will keep listening for new tasks until it is explicitly shutdown
       
        /*
            The goal is to keep Main from terminating before the other threads are done running.
            I couldn't get it to work with the way I have extendedThread1 and it doesn't work with
            the executor thread. However just having it wait until the below "runnableThread" is done
            tends to allow Main to terminate last. If you comment out this do while statement you will
            see that main terminates really quickly. Supposedly it is preferable to have main terminate last.
        */
       
       do {
          System.out.print(".");
          try {
              Thread.sleep(100);
          }
          catch (InterruptedException exc) {
              exc.printStackTrace();
          }

          }while (runnableThread.isAlive()); 
      
       System.out.println("Main thread ending.");
       System.out.println("Final Counter = " + counter.get());
    } 
}
     
       
       

