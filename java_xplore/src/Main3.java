    /*import java.util.*;*/
	class Main3 {

	    public static void main(String/*args*/[]) {
	        PriorityQueue p/*q*/ = new PriorityQueue();

	        System.out.println("\n Size of the Queue: " + pq.size());
	        pq.add("abc");
	        pq.add("123");
	        pq.add("def");
	        pq.add("456");
	        pq.add("768"); 

	        System.out.println("poll:" + pq.poll());
	        System.out.println("peek:" + pq.peek());
	        Iterator i = pq.iterator();
	        while (i.hasNext()) {
	            System.out.println(i.next());
	        }
	        System.out.println("\n Size of the Queue: " + pq.size());
	    }
	}


