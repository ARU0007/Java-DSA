package main.java.linear_datastructure.linkedlist.singlylinkedlist.generics;



import java.util.Scanner;

public class SLLGenerics<T> {
    Node<T> head = null;

    //creating functions.
    //creation.

    public void create() {
        int n;
        T data;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the data");
            data = (T) sc.next();
            Node<T> new_node = new Node<>(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("enter 1 for more data");
            n = sc.nextInt();

        } while (n == 1);
    }








    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;

        }


    }

}


