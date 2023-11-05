
import java.util.SortedSet;
import java.util.TreeSet;


public class Abstract_collection_Sorted_sset {
    
    public static void main(String [] args) {
        
        SortedSet<String> sortedSet = new TreeSet<>();
        
        sortedSet.add("1. Grape");
        sortedSet.add("3. Banana");
        sortedSet.add("5. Apple");
        sortedSet.add("2. Watermelon");
        sortedSet.add("4. Mango");
        
        System.out.println("SortedSet: " +sortedSet );
        System.out.println("First element in set: " + sortedSet.first());
        System.out.println("Last element in set: " + sortedSet.last());
        
        System.out.println("Interating through the sortedset:");
        for (String element : sortedSet) {
            System.out.println(element);  
        }
    }    
}
