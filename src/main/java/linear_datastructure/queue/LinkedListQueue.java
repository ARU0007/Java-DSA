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

    //Method to display the queue.
    public void display() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
        }
        System.out.println("Queue:");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
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
