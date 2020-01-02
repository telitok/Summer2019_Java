package day64_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	
	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue();
		     q1.add(10);
		     q1.add(20);
		     q1.add(30);
		     q1.add(10);  // accepts duplicates
		     
	 //    System.out.println(q1.get(0));  => gives error, because queue interface does not have index numbers.
		   System.out.println(q1);  // 10,10,30,20
		      q1.poll(); // the first "10" will be removed
		      
		   System.out.println(q1);  // 10,20,30
		      q1.poll();
		      
		   System.out.println(q1);  // 20,30  => first element "10" removed
		
		   
		   Queue<String>  q2 = new PriorityQueue<>() ;
	        
	        q2.add("Madina");
	        q2.add("Erhan");
	        q2.add("Mahriban");
	        q2.add("Alla");
	        
	        
	        System.out.println(q2);
	        
	        q2.poll();
	        System.out.println(q2);
	        
	        q2.poll();
	        System.out.println(q2);
	        
	        
	        Queue<Integer> q3 = new PriorityQueue<>();
	            q3.add(40);
	            q3.add(30);
	            q3.add(20);
	            q3.add(10);
	        
	            System.out.println(q3);
	        //Collections.sort(): sorts any collection type in ascending order
		   
		Deque<Integer> dq = new ArrayDeque();
		     dq.addFirst(10); // [10]
		     dq.addFirst(20); // [20, 10]
		     dq.addFirst(30); // [30, 20, 10]
		     
		     dq.addLast(40); // [30,20, 10, 40]
		     dq.addLast(5);
		     dq.addLast(3); // [30,20, 10, 40, 5, 3]
		     
		  System.out.println(dq);
		  
		    dq.removeFirst();
		    dq.removeLast();
		    
		  System.out.println(dq);
		  
		  System.out.println(dq.getFirst());
		  System.out.println(dq.getLast());
		  
		  dq.remove();
		  System.out.println(dq);
	}

}
