package com.example.javaalgorithms;

public class StackExample {

    static final int MAX = 1000;

    int top;
    int a[] = new int[MAX];     //Maximum size of the stack.

    //The conditions

    boolean ifStackIsEmpty(){
        return (top < 0);
    }

    //Constructor
    StackExample(){
        top = -1;
    }

    boolean pushElementIntoStack(int x){
        if(top >= (MAX - 1)){
            System.out.println("Stack Overflow");
            return false;
        }else{
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int popElementFromTheStack(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = a[top--];   //Delete one element from the stack
            return x;
        }
    }

    int peek(){
        if(top < 0){
            System.out.println("Stack Underflow");
        }else{
            int x = a[top]; //Return element at the top of the stack
            return x;
        }
        return 0;
    }

}
