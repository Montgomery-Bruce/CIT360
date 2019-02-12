
package cit360.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class CreateQueueInterface {
    
    public static void CreateMyQueueInterface() {
    System.out.println("Characteristics of a queue:");
    System.out.println("A queue is a First In First Out data structure");
    System.out.println("New elements are added at the back(enqueue) and removed from the front(dequeue)");
    System.out.println("A queue is just an interface. The LinkedList class implements the queue interface and therefore can be used as a queue");
    System.out.println(); 
    
    Queue<String> linkedListQueue = new LinkedList<>();
    
    //Adding new elements to the Queue
    linkedListQueue.add("Bruce");
    linkedListQueue.add("Alison");
    linkedListQueue.add("Austin");
    linkedListQueue.add("Zach");
    linkedListQueue.add("Madeline");
    linkedListQueue.add("Katie");
    linkedListQueue.add("Ben");
    
    System.out.println("Items in the queue will print as first in first out\n"
            + "The elements in the LinkedList were entered into the  queue as follows\n"
            + "Bruce, Alison, Austin, Zach, Madeline, Katie, Ben: Bruce is the First In and so would be the First Out\n"
            + "Printing the LinkedList Queue out would look like this " + linkedListQueue);
    System.out.println();
    
    System.out.println("You can remove and item from queue using either the remove() method or the poll() method. This is called Dequeue");
    
    linkedListQueue.poll();
    System.out.println("Which item was removed? " + linkedListQueue);
    System.out.println("As you can see Bruce was removed because it was the First In");
    }
    
    
}
