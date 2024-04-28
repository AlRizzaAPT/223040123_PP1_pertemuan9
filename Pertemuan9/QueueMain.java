package Pertemuan9;

public class QueueMain {
	    public static void main(String[] args) {
	        StrukturQueue queue = new StrukturQueue();
	        System.out.println("### Sebelum Enqueue 3x ###");
	        System.out.println("Size : " + queue.size());
	        System.out.println("isEmpty: " + queue.isEmpty());
	        queue.displayElement();
	        queue.enqueue(2);
	        queue.enqueue(7);
	        queue.enqueue(6);
	        queue.enqueue(1);
	        System.out.println("\n### Setelah Enqueue 4x ###");
	        System.out.println("Size : " + queue.size());
	        System.out.println("isEmpty: " + queue.isEmpty());
	        queue.displayElement();
	        System.out.println("\nFront : " + queue.front());
	        queue.dequeue();
	        queue.displayElement();
	    }
	}

