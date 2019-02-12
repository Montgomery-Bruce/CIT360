package cit360.Collections;
import java.util.HashMap;

public class CreateHashMap {
    
    public static void CreateMyHashMap(){
    System.out.println("Characteristics of a HashMap:");
    System.out.println("Is an unordered collection. It does not guarantee any specific order of the elements");
    System.out.println("Cannot contain duplicate keys");
    System.out.println("Allows null values and the null key");
    System.out.println("Is not thread safe");
    System.out.println();
    
        HashMap<String,Integer> hashMapAnimals = new HashMap<>();
    
        hashMapAnimals.put("Squirrels", 10);
        hashMapAnimals.put("Cats", 5);
        hashMapAnimals.put("Birds", 10);
        hashMapAnimals.put("Snakes",30);
        hashMapAnimals.put("Dogs", 3);
        
        System.out.println("The keys and the order they were entered (Squirrels, Cats, Birds, Snakes, Dogs), the way were retrieved " + hashMapAnimals);
        System.out.println();
        
        //Duplicate keys are not allowed
        
        hashMapAnimals.put("Dogs", 10);
        System.out.println("Tried to add duplicate element \"Dogs\" with a value of 10. As you can see it replaced the previous value of 3: " + hashMapAnimals);
        System.out.println("As you can see it was not allowed.");
        System.out.println();
        
        hashMapAnimals.put(null,4);
        System.out.println("You are allowed to have a null key but only one " + hashMapAnimals);
    }
}
