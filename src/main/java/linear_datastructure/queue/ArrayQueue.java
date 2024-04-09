package main.java.linear_datastructure.queue;

public class ArrayQueue {
    private final int[] queueArray;
    private int front; // front of the queue
    private int rear; // rear of the queue
    private int size; // current size of the queue
    private final int capacity; // maximum capacity of the queue

    // Constructor to initialize the queue with a specified capacity
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    //Method to enter the data
    public void enQueue(int data){
        if(isFull()){
            System.out.println("OverFlow");
        }
        rear=(rear+1)%capacity;
        queueArray[rear]= data;
        size++;
    }

    //Method to remove the data
    public void deQueue(){
        if(isEmpty()) System.out.println("UnderFlow");
        int remove_item = queueArray[front];
        front =(front + 1)%capacity;
        size--;
    }

    public int peek(){
        if(isEmpty()) {
            System.out.println("EmptyQueue");
        }
        return queueArray[front];
    }


    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the current size of the queue
    public int size() {
        return size;
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
    }


}
