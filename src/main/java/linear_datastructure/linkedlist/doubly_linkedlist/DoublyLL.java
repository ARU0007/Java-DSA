package main.java.linear_datastructure.linkedlist.doubly_linkedlist;
import java.util.Scanner;
public class DoublyLL {
    Node head = null;
    Node tail = null;



    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
}

