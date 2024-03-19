package main.java.linear_datastructure.linkedlist.singlylinkedlist;
import java.util.Scanner;

public class SinglyLInkedList {
    Node head = null;

    //    creating functions------------------------------>
    public void creation() {
        int n;
        int data;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to add more data, Press-1");
            n = sc.nextInt();
        } while (n == 1);

    }



    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
