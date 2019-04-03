//by geekforgeeks
import java.util.*; 

class minheap { 
    public static void main(String args[]) 
    { 
        // Creating empty priority queue 
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder()); 
  
        // Adding items to the pQueue using add() 
        pQueue.add(50); 
        pQueue.add(30); 
        pQueue.add(20); 
        pQueue.add(400); 
  
        // Printing the most priority element 
        System.out.println("Head value using peek function:" + pQueue.peek()); 
  
        // Printing all elements 
        System.out.println("The queue elements:"+pQueue); 
        
  
        // Removing the top priority element (or head) and 
        // printing the modified pQueue using poll() 
        pQueue.poll(); 
        System.out.println("After removing an element "
                           + "with poll function:"+pQueue); 
                        
  
        // Removing 30 using remove() 
        pQueue.remove(30); 
        System.out.println("after removing 30 with"
                           + " remove function:"+pQueue); 
        
        // Check if an element is present using contains() 
        boolean b = pQueue.contains(20); 
        System.out.println("Priority queue contains 20 "
                           + "or not?: " + b); 
    }
} 