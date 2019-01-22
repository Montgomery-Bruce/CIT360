package ThreadExecutorRunnable;

//Create a class that is a subclass of Thread
public class MyExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
        System.out.println(Thread.currentThread().getId() + "My Extended Thread Running " + i); //shows which thread is printing
    }
        try {
             Thread.sleep(100);
        }
        catch (InterruptedException exc) {
            exc.printStackTrace();
        }   
}
}


