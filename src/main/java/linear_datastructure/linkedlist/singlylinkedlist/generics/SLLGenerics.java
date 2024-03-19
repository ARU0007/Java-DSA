package main.java.linear_datastructure.linkedlist.singlylinkedlist.generics;



import java.util.Scanner;

public class SLLGenerics<T> {
    Node<T> head = null;





    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;

        }


    }

}


