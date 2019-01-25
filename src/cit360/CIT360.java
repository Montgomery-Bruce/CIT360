package cit360;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class MyExtendedThread extends Thread{
    public void run(){
       try {
        for(int i=0; i<5; i++){
            
        Thread.sleep(400);
        System.out.println(Thread.currentThread().getId() + "My Extended Thread Running " + i); //shows which thread is printing
        }
       } 
        catch (InterruptedException exc) {
            exc.printStackTrace();
        }   
}
}

class MyRunnableThread implements Runnable {

     public void run() {
         try {
        for(int i=0; i<5; i++){
            
        Thread.sleep(400);
        System.out.println(Thread.currentThread().getId() + "My Runnable Thread Running " + i); //shows which thread is printing
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
        System.out.println(Thread.currentThread().getName() + "My Executor Thread Running "); //shows which thread is printing
        }
        }catch (InterruptedException exc){
        exc.printStackTrace();
        }   
           
    }    
}


public class CIT360 {

    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName()); //This prints the name of the main thread when the program first starts
       
       MyExtendedThread extendedThread1 = new MyExtendedThread(); //This creates a MyExtendedThread class object and names it extendedThread
       extendedThread1.start(); //This starts the extendedThread object
       
       MyRunnableThread runnableObject = new MyRunnableThread(); //This creates an MyRunnableThread "Runnable" object and names it runnableObject
       Thread runnableThread = new Thread(runnableObject); //Now a thread called runnableThread is contstructed from the runnableObject
       runnableThread.start(); //Start execution of the thread
       
       ExecutorService executorThread = Executors.newFixedThreadPool(3); //create the pool of threads
       Runnable ExecutorThread1 = new MyExecutorThread(); 
       Runnable ExecutorThread2 = new MyExecutorThread(); //Create 3 new objects of type MyExecutorThread class
       Runnable ExecutorThread3 = new MyExecutorThread();
       
       executorThread.execute(ExecutorThread1); 
       executorThread.execute(ExecutorThread2); //Submit the task for execution
       executorThread.execute(ExecutorThread3);
       
       executorThread.shutdown(); //The executor service will keep listening for new tasks until it is explicitly shutdown
       
       
      // You can play with the sleep times below to see what happens. If you comment out the whole do/while you will see that main terminates before the other threads.
      // Supposedly it is preferable to have main terminate last.
      
      
       do {
          System.out.print(".");
          try {
              Thread.sleep(100);
          }
          catch (InterruptedException exc) {
              exc.printStackTrace();
          }
          
          }while (extendedThread1.isAlive() || runnableThread.isAlive()); //As long as these threads are running main will not terminate.
        
       System.out.println("Main thread ending.");
    
    } 
}
     
       
       

