package cit360.Collections;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.SortedSet;

public class CreateTreeSet {
    
    public static void CreateMyTreeSet(){
    System.out.println("Characteristics of a TreeSet:");
    System.out.println("A TreeSet stores only one object");
    System.out.println("Cannot contain dubplicate elements");
    System.out.println("Elements sorted by natural sorting or based on a custom Comparator");
    System.out.println("Cannot contain null values");
    System.out.println("Is not thread safe");
    System.out.println();
    
        SortedSet<String> animals = new TreeSet<>();
        SortedSet<String> sortedAnimals = new TreeSet<>(Comparator.reverseOrder());
    
    //Add new elements to TreeSet animals
    animals.add("Squirrels");
    animals.add("Cats");
    animals.add("Birds");
    animals.add("Snakes");
    animals.add("Dogs");
    
    System.out.println("A TreeSet with the elements added as follows, Squirrels, Cats, Birds, Snakes, Dogs sorts the list in a natural order " + animals);
    System.out.println();
    
    //Add new elements to TreeSet sortedAnimals
    
    sortedAnimals.add("Squirrels");
    sortedAnimals.add("Cats");
    sortedAnimals.add("Birds");
    sortedAnimals.add("Snakes");
    sortedAnimals.add("Dogs");
    
    System.out.println("However if a custom comparator of sorting in reverse order is used it will sort in reverse order  " + sortedAnimals);
    System.out.println();
    
    //Duplicate elements are not allowed
    animals.add("Dogs");
    System.out.println("Tried to add duplicate element \"Dogs\" : " + animals);
    System.out.println("As you can see it was not allowed.");
    System.out.println();
    }
}
