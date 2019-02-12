package cit360.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author brucem
 */
public class CreateArrayList {
        
    public static void CreateArrayList(){
    List<String> tools = new ArrayList<>();
    
    //Add tool elements to the ArrayList. An ArrayList maintains its order by insertion
    tools.add("Shovel");
    tools.add("Pitch Fork");
    tools.add("Rake");
    tools.add("Hoe");
    
    System.out.println("These are the elements in the array." + tools);
    System.out.println();
    
    //A Java ArrayList can contain duplicate elements and can also remove or add elements. It is dynamic
    
    tools.add("Shovel");
    tools.add("Rake");
    
     System.out.println("Duplicate elements can be added " + tools);
     System.out.println();
     
    //You can remove and item from an ArrayList by its index
    
    tools.remove(3); //remove Hoe at index 3
    
    System.out.println("The element Hoe was removed by targeting its index " + tools);
    System.out.println();
    
    //Insert and element at a certain point in the array
    tools.set(0, "New-Shovel");
    System.out.println("New-Shovel was added as the first element in the ArrayList " + tools);
    
    
   
    
    }
}
