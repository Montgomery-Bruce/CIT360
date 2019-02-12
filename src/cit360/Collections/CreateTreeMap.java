package cit360.Collections;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.SortedMap;

public class CreateTreeMap {
    
    public static void CreateTreeMap(){
    System.out.println("Characteristics of a TreeMap:");
    System.out.println("A TreeMap stores two objects, a Key and a Value");
    System.out.println("Cannot contain dubplicate keys but can contain duplicate values");
    System.out.println("Elements sorted by the key and not the value. Sorted by natural sorting or based on a custom Comparator");
    System.out.println("Cannot contain null keys but can contain null values");
    System.out.println("Is not thread safe");
    System.out.println();
    
        SortedMap<String, Integer> tools = new TreeMap<>();
        SortedMap<String, Integer> sortedTools = new TreeMap<>(Comparator.reverseOrder());
    
    //Add new key-value pairs to TreeMmap animals
    tools.put("Hoe", 3);
    tools.put("Pitch Fork", 5);
    tools.put("Plows", 2);
    tools.put("Rake", 6);
    tools.put("Gloves", 20);
    
    System.out.println("A TreeMap with the elements added as follows, (Hoe,3), (Pitch Fork, 5), (Plows, 2), (Rake, 6), and (Gloves, 20) sorts the list in a natural order based on the key " + tools);
    System.out.println();
    
    //Add new elements to TreeMap sortedTools
    
    sortedTools.put("Hoe", 3);
    sortedTools.put("Pitch Fork", 5);
    sortedTools.put("Plows", 2);
    sortedTools.put("Rake", 6);
    sortedTools.put("Gloves", 20);
    
    System.out.println("However if a custom comparator of sorting in reverse order is used it will sort in reverse order  " + sortedTools);
    System.out.println();
    
    //Duplicate Keys are not allowed but duplicate values are allowed
    tools.put("Hoe", 3);
    tools.put("Shovel", 3);
    System.out.println("Tried to add duplicate element \"Hoe\" : " + tools);
    System.out.println("As you can see it was not allowed.");
    System.out.println();
    System.out.println("However I was able to add shovel and it has a duplicate value of 3");
    System.out.println();
    }
}

