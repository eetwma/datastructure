//by geeksforgeeks
import java.util.*; 
class hashtable { 
    public static void main(String[] arg) 
    { 
        // creating a hash table 
        Hashtable<Integer, String> h = 
                      new Hashtable<Integer, String>(); 
  
        Hashtable<Integer, String> h1 = 
                      new Hashtable<Integer, String>(); 
  
        h.put(3, "We"); 
        h.put(2, "SSCRG"); 
        h.put(1, "isBest"); 
  
        // create a clone or shallow copy of hash table h 
        h1 = (Hashtable<Integer, String>)h.clone(); 
        //get the value by using the key
        System.out.println("values of key 3 is: " + h.get(3));

        // checking clone h1 
        System.out.println("values in clone: " + h1); 
        
        // clear hash table h 
        h.clear(); 
  
        // checking hash table h 
        System.out.println("after clearing: " + h); 

        
    } 
} 