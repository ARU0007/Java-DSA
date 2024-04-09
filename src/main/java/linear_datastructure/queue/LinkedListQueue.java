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



    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
}
