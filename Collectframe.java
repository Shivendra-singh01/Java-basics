//Collection framework is the collection of different interfaces and classes.
//Root class is Iterable
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
// import java.util.HashSet;
// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Set;


public class Collectframe {
    
  /**
 * @param args
 */
public static void main(String[] args) {
        //Arraylist
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(12);
        arrlist.add(20);
        int a=arrlist.get(0);
        System.out.println("Arraylist="+arrlist);
        System.out.println(a);

        // Vector
        Vector<Double> vec=new Vector<>();
        vec.add(12.3);
        vec.add(23.222222);
        vec.remove(1);
        System.out.println("Vector="+vec);

//Arraylist and similar to each other, Arraylist is fast but 
// unsynchronised and thread unsafe
// and Vector is slow but synchronised and threadsafe

        // Stack
        Stack<Integer> stck = new Stack<>();
        stck.push(10);
        stck.push(20);
        stck.push(30);
        System.out.println(stck);
        System.out.println(stck.peek());
        stck.pop();
        System.out.println("Stack="+stck);

        // Set - no duplicacy allowed, unordered (randomly store data)
        // Linkedhashset give ordered data with no duplicacy
        Set<Integer> set1=  new LinkedHashSet<Integer>();
        set1.add(122);
        set1.add(13);
        set1.add(144);
        set1.add(45);
        System.out.println(set1);
        boolean b1=set1.contains(144);
        System.out.println("144 is present- " + b1);
        System.out.println(set1.size());
        
        // TreeSet - Set with the property of tree
        Set<Integer> TS1 = new TreeSet<Integer>();
        TS1.add(123);
        TS1.add(12);
        TS1.add(34);
        TS1.add(23);
        System.out.println("TreeSet="+TS1);
       
        // Queue follows FIFO
         Queue<Integer> qu1= new LinkedList<Integer>() ;
            qu1.offer(1);
            qu1.offer(2);
            qu1.offer(3);
            qu1.add(4);
            System.out.println(qu1.peek());
            System.out.println(qu1.poll()); //Poll remove and return 1st elemnt
            System.out.println("Queue="+qu1);
          
        //Dequeue=double ended queue insert and delete from front and last
        Deque<Integer> dequ= new ArrayDeque<Integer>();
        dequ.offer(12);
        dequ.offer(13);
        dequ.offerLast(11);
        dequ.offerFirst(14);
        System.out.println("Deque="+dequ);
         
        // Priority queue -> min heap by default in java
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.offer(12);
        pq.offer(8);
        pq.add(15);
        pq.add(16);
        System.out.println("Priority queue=" + pq);

        // Map-used to store grouped data
        // contain key, value and key value pair
        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(1,"Anshul");
        hash.put(2,"Shivendra");
        hash.put(3,"Shiv");
        
        
        System.out.println("HashMap-"+hash);
        System.out.println(hash.containsKey(2));


    
    }

}