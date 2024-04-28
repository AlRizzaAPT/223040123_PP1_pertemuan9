package Pertemuan9;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    // Setter and Getter
    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
