package main.java.linear_datastructure.stack.array_stack;

import main.java.linear_datastructure.stack.adt.Stack;

public class ArrayStack implements Stack {
    public int[] array;
    int top;
    int size;

    public ArrayStack(int capacity) {
        this.array = new int[capacity];
        this.top = -1;
        this.size = 0;

    }

    //override the methods''''''''''''''''''''''''''''''''''''''''''''

    @Override
    public void push(int data) {
        if(top==array.length -1){                     //check for overflow
            System.err.println("Stack overflow");     //return error statement
        }
        top++;                      //else
        array[top]=data;
        size++;

    }

    @Override
    public int pop() {
        if (isunderflow()) {                           //check for underflow
            System.err.println("Stack underflow");
            return Integer.MIN_VALUE;                  //return Min value
        }
        int popedvalue = array[top];                   //else
        array[top--] = 0;
        size--;
        return popedvalue;

    }

    @Override
    public int peek() {
        if(isunderflow()){                                  //check for underflow
            System.err.println("Stack Underflow");
            return Integer.MIN_VALUE;                      //return Min value
        }
        return array[top];
    }

    @Override
    public int getsize(){ return size;}         //retuen the Size of stack

    @Override
    public boolean isunderflow() { return top == -1; }  //return -1 if Stack is underflow
}
