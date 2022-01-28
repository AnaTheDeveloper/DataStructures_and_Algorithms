package com.example.javaalgorithms;


public class LinkedListExample {

    Node head;          //Created the head of the list.

    static class Node{

        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    //Inserting a new node using a method.
    public static LinkedListExample insert(LinkedListExample list, int data){

        //Creating a new node with some data.
        Node newNode = new Node(data);
        newNode.next = null;

        //If the linked list is empty then make the new node the head.
        if(list.head == null){
            list.head = newNode;
        }else{
        //Else go through the list till the last node and insert the new node there.
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
        //Insert the new node at last node
            last.next = newNode;
        }

        //Return the list by head
        return list;
    }

    //This method prints the linked list
    public static void printList(LinkedListExample list){

        Node currNode = list.head;
        System.out.println("Linked List: ");

        //Go through the linked list
        while(currNode != null){
            //Print the data at the current node
            System.out.println(currNode.data + " ");

            //Go to the next node
            currNode = currNode.next;
        }
    }

}
