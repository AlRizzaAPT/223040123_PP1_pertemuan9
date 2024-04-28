package Pertemuan9;

import java.util.NoSuchElementException;

public class StrukturQueue {

    private Node FRONT;
    private Node REAR;

    // isEmpty()
    public boolean isEmpty() {
        return FRONT == null;
    }

    // menambahkan elemen
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    // dequeue menghapus elemen pertama
    public void dequeue() {
        if (FRONT != null) {
            if (FRONT == REAR) {
                FRONT = null;
                REAR = null;
            } else {
                FRONT = FRONT.getNext();
            }
        }
    }

    // size menghitung jumlah elemen
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    // front mengambil elemen pertama
    public int front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return FRONT.getData();
    }

    // display element
    public void displayElement() {
        Node curNode = FRONT;
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue Kosong");
        } else {
            System.out.print("Elemen Queue: ");
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
        }
    }
}
