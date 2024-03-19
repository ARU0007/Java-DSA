package main.java.linear_datastructure.linkedlist.doubly_linkedlist;
import java.util.Scanner;
public class DoublyLL {
    Node head = null;
    Node tail = null;

    //creation----------------------------------------------
    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                head.previous = new_node;
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Press 1 to enter more data");
            n = sc.nextInt();
        } while (n == 1);

    }

    //traverser-----------------------------------
    public void traverser() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList doesn't exist");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }



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

