package main.java.linear_datastructure.queue;

public class LinkedListQueue {
    int size;
    private Node front; //Queue's front data.
    private Node rear; //Quese's rear.

    //constructer to initialize Queue.
    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;

    }

    //Method to insert data.
    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }
    // Method to remove the data
    public void deQueue() {
        if (isEmpty()) {
            System.out.println("UnderFlow");
            return;
        }
        Node temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }



    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
}
