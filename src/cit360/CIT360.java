package cit360;

class MyExtendedThread extends Thread{
    public void run(){
       try {
        for(int i=0; i<10; i++){
            
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
        for(int i=0; i<10; i++){
            
        Thread.sleep(400);
        System.out.println(Thread.currentThread().getId() + "My Runnable Thread Running " + i); //shows which thread is printing
        }
       } 
        catch (InterruptedException exc) {
            exc.printStackTrace();
        }   
           
        }    
    }



public class CIT360 {

    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName()); //This prints the name of the main thread
       
       MyExtendedThread extendedThread1 = new MyExtendedThread(); //This creates a MyExtendedThread class object and names it extendedThread
       extendedThread1.start(); //This starts the extendedThread object
       
       MyRunnableThread runnableObject = new MyRunnableThread(); //This creates an MyRunnableThread "Runnable" object and names it runnableObject
       Thread runnableThread = new Thread(runnableObject); //Now a thread called runnableThread is contstructed from the runnableObject
       runnableThread.start(); //Start execution of the thread
       
       MyExtendedThread  extendedThread2 = new MyExtendedThread();
       extendedThread2.start();
       
      /*
       do {
          System.out.print(".");
          try {
              Thread.sleep(100);
          }
          catch (InterruptedException exc) {
              exc.printStackTrace();
          }
          
          }while (extendedThread1.isAlive() || runnableThread.isAlive() || extendedThread2.isAlive());
      */   
       System.out.println("Main thread ending.");
    
    } 
}
     
       
       

