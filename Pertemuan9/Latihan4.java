package Pertemuan9;

public class Latihan4 {
	public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("Size : " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.enqueue(3);
        queue.enqueue(3);
        queue.enqueue(3);
        System.out.println("\n### Setelah Enqueue 3x ###");
        System.out.println("Size : " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front : " + queue.front());

    }
}